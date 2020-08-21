// NestedClasses/LocalClasses.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package nestedclasses

fun localClasses() {
  open class Amphibian
  class Frog: Amphibian()
  val amphibian: Amphibian = Frog()
}
