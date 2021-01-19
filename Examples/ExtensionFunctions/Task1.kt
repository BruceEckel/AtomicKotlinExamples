// ExtensionFunctions/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package extensionFunctionsExercise1
import atomictest.eq

fun String.wrapInTag(tagName: String): String = "<$tagName>$this</$tagName>"

fun main() {
  "cat".wrapInTag("animal") eq "<animal>cat</animal>"
}
