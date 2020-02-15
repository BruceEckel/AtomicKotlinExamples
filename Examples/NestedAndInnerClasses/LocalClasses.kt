// NestedAndInnerClasses/LocalClasses.kt
package innernested

fun localClasses() {
  open class Amphibian
  class Frog: Amphibian()
  val amphibian: Amphibian = Frog()
}
