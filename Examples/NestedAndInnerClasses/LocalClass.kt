// NestedAndInnerClasses/LocalClass.kt

fun classInFunction() {
  open class Amphibian
  class Frog: Amphibian()
  val amphibian: Amphibian = Frog()
}
