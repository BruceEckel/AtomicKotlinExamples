// Reflection/Info.kt

fun info(a: Any) {
  val kc = a::class
  println("${kc::class}")
  for (st in kc::class.supertypes)
    println("$st")
  println("---")
  for (kcm in kc::class.members)
    println("$kcm")
  println("===")
  println("simpleName: ${kc.simpleName}")
  println(
    "qualifiedName: ${kc.qualifiedName}")
  println("Constructors:")
  for (ctor in kc.constructors)
    println("  $ctor")
  println("Members:")
  for (memb in kc.members)
    println("  $memb")
//  println("Declared Functions:")
//  for(df in kc.declaredFunctions)
//    println("  $df")
  println("Super Types:")
  for (st in kc.supertypes)
    println("  $st")
  println("isData: ${kc.isData}")
}

data class Baz(val i: Int, val s: String) {
  constructor() : this(11, "Joy")
}

fun main(args: Array<String>) {
  info(Baz(1, "Happy"))
}
