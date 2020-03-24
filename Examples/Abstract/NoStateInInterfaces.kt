// Abstract/NoStateInInterfaces.kt
package abstractclasses

interface IntList {
  val name: String
  // Doesn't compile:
  // val list = listOf(0)
}
