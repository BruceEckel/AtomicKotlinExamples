// NestedClasses/ReturnLocal.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package nestedclasses

interface Amphibian

fun createAmphibian(): Amphibian {
  class Frog : Amphibian
  return Frog()
}

fun main() {
  val amphibian = createAmphibian()
  // amphibian as Frog
}
