// MemberReferences/FunctionReference.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package memberreferences2
import atomictest.eq

data class Message(
  val sender: String,
  val text: String,
  val isRead: Boolean,
  val attachments: List<Attachment>
)

data class Attachment(
  val type: String,
  val name: String
)

fun Message.isImportant(): Boolean =
  text.contains("Salary increase") ||
    attachments.any {
      it.type == "image" &&
        it.name.contains("cat")
    }

fun main() {
  val messages = listOf(Message(
    "Boss", "Let's discuss goals " +
    "for next year", false,
    listOf(Attachment("image", "cute cats"))))
  messages.any(Message::isImportant) eq true
}
