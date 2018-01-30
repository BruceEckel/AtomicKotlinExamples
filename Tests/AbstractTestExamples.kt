import org.junit.Assert
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.PrintStream
import java.util.function.Consumer

abstract class AbstractTestExamples {
  protected fun testExample(fileName: String, main: Consumer<Array<String>>) {
    val exampleCode = File(fileName).readText()
    val outputComment = "/* Output:"
    if (exampleCode.contains(outputComment)) {
      val output = extractOutput(exampleCode, outputComment)
      testOutput(fileName, output, main)
    }
    val inputOutputComment = "/* Input/Output:"
    if (exampleCode.contains(inputOutputComment)) {
      val inputAndOutput = extractOutput(exampleCode, inputOutputComment)
      testInputOutput(inputAndOutput, main)
    } else {
      testAtomicChecks(fileName, main)
    }
  }

  private fun extractOutput(exampleCode: String, outputComment: String) =
          exampleCode.substringAfter(outputComment).substringBefore("*/").trim()

  private fun String.trimAndNormalizeLineSeparators() =
      trim().replace("\\R".toRegex(), System.getProperty("line.separator"))

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

    return out.toString()
  }

  private fun testInputOutput(inputAndOutput: String, main: Consumer<Array<String>>) {
    val (inputLines, outputLines) = inputAndOutput.lines().partition { it.startsWith(">>>") }
    val input = inputLines.map { it.substringAfter(">>> ") }.joinToString("\n")
    val output = outputLines.joinToString("\n")

    val inputStream = ByteArrayInputStream(input.toByteArray())
    System.setIn(inputStream)

    val out = ByteArrayOutputStream()
    System.setOut(PrintStream(out))

    main.accept(arrayOf())

    Assert.assertEquals(output, out.toString().trim())
  }

  private fun testAtomicChecks(fileName: String, main: Consumer<Array<String>>) {
    val output = runAndGetOutput(main)
    Assert.assertFalse("AtomicTest checks failed for '$fileName':\n$output", output.contains("[Error]:"))
  }
}
