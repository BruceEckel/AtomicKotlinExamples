// NestedClasses/ReturnLocal.kt
package nestedclasses

interface Amphibian

fun createAmphibian(): Amphibian {
  class Frog: Amphibian
  return Frog()
}

fun main() {
  val amphibian = createAmphibian()
  // amphibian as Frog
}
