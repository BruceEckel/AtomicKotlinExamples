// MemberReferences/TopLevelFunctionRef.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package memberreferences2
import atomictest.eq

fun ignore(message: Message) =
  !message.isImportant() &&
    message.sender in setOf("Boss", "Mom")

fun main() {
  val text = "Let's discuss goals " +
    "for the next year"
  val msgs = listOf(
    Message("Boss", text, false, listOf()),
    Message("Boss", text, false, listOf(
      Attachment("image", "cute cats"))))
  msgs.filter(::ignore).size eq 1
  msgs.filterNot(::ignore).size eq 1
}
