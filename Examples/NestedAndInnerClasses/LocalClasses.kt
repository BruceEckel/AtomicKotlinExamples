// NestedAndInnerClasses/LocalClasses.kt
package innernested

fun localClasses() {
  interface Amphibian
  class Frog: Amphibian()
  val amphibian: Amphibian = Frog()
}

interface Shape

fun returnLocalClass() {

}
