// MemberReferences/SortWith.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package memberreferences1
import atomictest.eq

fun main() {
  val messages = listOf(
    Message("Kitty", "Hey!", true),
    Message("Kitty", "Where are you?", false),
    Message("Boss", "Meeting today", false))
  messages.sortedWith(compareBy(
    Message::isRead, Message::sender)) eq
    listOf(
      // First unread, sorted by sender:
      Message("Boss", "Meeting today", false),
      Message("Kitty",
        "Where are you?", false),
      // Then read, also sorted by sender:
      Message("Kitty", "Hey!", true))
}
