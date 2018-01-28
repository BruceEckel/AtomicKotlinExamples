// Interfaces/NoStateInInterfaces.kt
package interfaces3

interface Animal {
  val sound: String
  fun talk(): String

  // Doesn't compile:
  // val age = 1
}
