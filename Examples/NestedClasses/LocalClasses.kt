// NestedClasses/LocalClasses.kt
package nestedclasses

fun localClasses() {
  open class Amphibian
  class Frog: Amphibian()
  val amphibian: Amphibian = Frog()
}
