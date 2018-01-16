package generating

import java.io.File

fun main(args: Array<String>) {
    generateExampleTests()
}

fun generateExampleTests() {
    val examples = File("Examples")
    val exampleFiles = examples.listFiles().flatMap { atom ->
        atom.listFiles().filter { it.extension == "kt" }.map {
            ExampleInfo.create(it)
        }
    }
    val tests = generateTests(exampleFiles)
    File("Tests/TestExamples.java").writeText(tests)
}

data class ExampleInfo(
        val file: File,
        val name: String,
        val packageName: String?
) {
    val classForFileName: String
        get() = name + "Kt"

    val qualifiedName: String
        get() = if (packageName != null) "$packageName.$classForFileName" else classForFileName

    companion object {
        fun create(file: File): ExampleInfo {
            val name = file.nameWithoutExtension
            val lines = file.readLines()
            val packageName = lines.find { it.startsWith("package ") }?.substringAfter("package ")?.trim()
            return ExampleInfo(file, name, packageName)
        }
    }
}

fun generateTests(exampleInfoList: List<ExampleInfo>): String {
    val namesFrequency = mutableMapOf<String, Int>()
    val tests = mutableListOf<String>()
    for (exampleInfo in exampleInfoList) {
        if (!exampleInfo.file.readText().contains("fun main")) continue

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

        tests += """
            @Test
            public void $exampleName() {
                testExample("${(exampleInfo.file.path).replace("\\", "/")}", ${exampleInfo.qualifiedName}::main);
            }""".replaceIndent("    ")
    }

    return buildString {
        appendln("import org.junit.Test;")
        appendln()
        appendln("""
                public class TestExamples extends AbstractTestExamples {
                """.trimIndent())
        for (test in tests) {
            appendln()
            appendln(test)
        }
        append("}\n")
    }
}
