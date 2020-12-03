// Interfaces/SAMConversion.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package interfaces
import atomictest.trace

fun interface Action {
  fun act()
}

fun delayAction(action: Action) {
  trace("Delaying...")
  action.act()
}

fun main() {
  delayAction { trace("Hey!") }
  trace eq "Delaying... Hey!"
}
