// interfaces/NoStateInInterfaces.kt
package interfaces2

interface Animal {
  val sound: String
  fun talk(): String

  // Doesn't compile:
  // val age = 1
}
