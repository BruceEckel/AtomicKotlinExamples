package generating
import java.io.File

fun main() {
  val exampleFiles = File("Examples")
    .listFilesFixedOrder()
    .flatMap { atom ->
      atom
        .listFilesFixedOrder()
        .filter { it.extension == "kt" }
    }
  val testFiles = File("Tests/unittesting")
    .listFilesFixedOrder()
  val allFiles = (exampleFiles + testFiles)
    .map { ExampleInfo.create(it) }
  File("Tests/TestExamples.java").writeText(
    generateTests(allFiles))
}

fun File.listFilesFixedOrder() = listFiles()!!
    .sortedBy { it.name.toLowerCase() }

data class ExampleInfo(
  val file: File,
  val name: String,
  val packageName: String?
) {
  val classForFileName: String
    get() = name + "Kt"
  val qualifiedName: String
    get() = if (packageName != null)
      "$packageName.$classForFileName"
    else classForFileName

  companion object {
    fun create(file: File): ExampleInfo {
      val name = file.nameWithoutExtension
      val lines = file.readLines()
      val packageName = lines
        .find { it.startsWith("package ") }
        ?.substringAfter("package ")
        ?.trim()
      return ExampleInfo(file, name, packageName)
    }
  }
}

fun generateTests(exampleInfoList: List<ExampleInfo>): String {
  val namesFrequency = mutableMapOf<String, Int>()
  val tests = mutableListOf<String>()
  for (exampleInfo in exampleInfoList) {
    val text = exampleInfo.file.readText()
    val isJunitTest = text.contains("import kotlin.test.") && text.contains("class ${exampleInfo.name}")
    if (!text.contains("fun main") && !isJunitTest) continue
    val classForFileName = exampleInfo.classForFileName
    val index = if (classForFileName in namesFrequency) {
      val frequency = namesFrequency.getValue(classForFileName)
      namesFrequency[classForFileName] = frequency + 1
      "$frequency"
    } else {
      namesFrequency[classForFileName] = 1
      ""
    }
    val exampleName = """test${exampleInfo.name.capitalize()}$index"""

    val testMethodBody = if (isJunitTest)
      """testJUnitClass(${exampleInfo.packageName}.${exampleInfo.name}.class);"""
    else {
      """testExample("${(exampleInfo.file.path).replace("\\", "/")}", ${exampleInfo.qualifiedName}::main);"""
    }

    tests += """
            @Test
            public void $exampleName() {
              $testMethodBody
            }""".replaceIndent("  ")
  }

  return buildString {
    appendLine("import org.junit.Test;")
    appendLine()
    appendLine("""
                public class TestExamples extends AbstractTestExamples {
                """.trimIndent())
    for (test in tests) {
      appendLine()
      appendLine(test)
    }
    append("}\n")
  }
}
