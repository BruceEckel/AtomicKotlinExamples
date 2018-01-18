import org.junit.Assert
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.PrintStream
import java.util.function.Consumer

abstract class AbstractTestExamples {
    protected fun testExample(fileName: String, main: Consumer<Array<String>>) {
        val exampleCode = File(fileName).readText()
        if (exampleCode.contains("/* Output:")) {
            val output = extractOutput(exampleCode)
            testOutput(fileName, output, main)
        }
        testAtomicChecks(fileName, main)
    }

    private fun extractOutput(exampleCode: String) =
            exampleCode.substringAfter("/* Output:").substringBefore("*/").trim()

    private fun String.trimAndNormalizeLineSeparators() = trim().replace("\\R".toRegex(), System.getProperty("line.separator"))

    private fun testOutput(fileName: String, expectedOutput: String, main: Consumer<Array<String>>) {
        val actualOutput = runAndGetOutput(main)
        Assert.assertEquals("Incorrect output for '$fileName':\n",
                expectedOutput.trimAndNormalizeLineSeparators(),
                actualOutput.trimAndNormalizeLineSeparators())
    }

    private fun runAndGetOutput(main: Consumer<Array<String>>): String {
        val out = ByteArrayOutputStream()
        System.setOut(PrintStream(out))

        main.accept(arrayOf())

        val toString = out.toString()
        return toString
    }

    private fun testAtomicChecks(fileName: String, main: Consumer<Array<String>>) {
        val output = runAndGetOutput(main)
        Assert.assertFalse("AtomicTest checks failed for '$fileName':\n$output", output.contains("[Error]:"))
    }
}
