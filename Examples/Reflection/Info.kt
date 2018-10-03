// Reflection/Info.kt

fun info(a: Any) {
  val kc = a::class
  println("${kc::class}")
  kc::class.supertypes.forEach {
    println("$it")
  }
  println("---")
  kc::class.members.forEach { println("$it") }
  println("===")
  println("simpleName: ${kc.simpleName}")
  println(
    "qualifiedName: ${kc.qualifiedName}")
  println("Constructors:")
  kc.constructors.forEach { println("$it") }
  println("Members:")
  kc.members.forEach { println("  $it") }
  println("Super Types:")
  kc.supertypes.forEach { println("  $it") }
  println("isData: ${kc.isData}")
}

data class Baz(val i: Int, val s: String) {
  constructor() : this(11, "Joy")
}

fun main() {
  info(Baz(1, "Happy"))
}
