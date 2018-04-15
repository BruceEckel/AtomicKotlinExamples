// MemberReferences/TopLevelFunctionRef.kt
package memberreferences2

import atomictest.eq

fun isToBeIgnored(message: Message) =
  !message.isImportant() &&
    message.sender in setOf("Boss", "Mom")

fun main(args: Array<String>) {
  val text = "Let's discuss the goals " +
    "for the next year"
  val messages = listOf(
    Message("Boss", text, false, listOf()),
    Message("Boss", text, false, listOf(
      Attachment("image", "cute cats"))))

  messages.filter(::isToBeIgnored).size eq 1
  messages.filterNot(::isToBeIgnored).size eq
    1
}
