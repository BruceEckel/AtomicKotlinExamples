// Abstract/NoStateInInterfaces.kt
package interfaces

interface IntList {
  val name: String

  // Doesn't compile:
  // val list = listOf(0)
}
