// Abstract/NoStateInInterfaces.kt
package abstract

interface IntList {
  val name: String
  // Doesn't compile:
  // val list = listOf(0)
}
