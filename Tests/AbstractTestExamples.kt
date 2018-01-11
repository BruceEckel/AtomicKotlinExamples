import atomictest.trace
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
            testOutput(output, main, trim = true)
        }
        testNoErrors(main)
    }

    private fun extractOutput(exampleCode: String) =
            exampleCode.substringAfter("/* Output:").substringBefore("*/").trim()

    private fun testOutput(output: String, main: Consumer<Array<String>>, trim: Boolean) {
        val result = runAndGetOutput(main).let {
            if (trim) it.trim() else it
        }
        Assert.assertEquals(output, result)
    }

    private fun runAndGetOutput(main: Consumer<Array<String>>): String {
        val out = ByteArrayOutputStream()
        System.setOut(PrintStream(out))

        trace.reset()
        main.accept(arrayOf())

        val toString = out.toString()
        return toString
    }

    private fun testNoErrors(main: Consumer<Array<String>>) {
        val output = runAndGetOutput(main)
        Assert.assertFalse("Program completed with errors:\n$output", output.contains("[Error]:"))
    }
}
