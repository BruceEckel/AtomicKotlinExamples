fun typeinfo(o: Any) {
  val c = o::class
  println("constructors: ${c.constructors}")
  println("isAbstract: ${c.isAbstract}")
  println("isCompanion: ${c.isCompanion}")
  println("isData: ${c.isData}")
  println("isFinal: ${c.isFinal}")
  println("isInner: ${c.isInner}")
  println("isOpen: ${c.isOpen}")
  println("isSealed: ${c.isSealed}")
  println("members: ${c.members}")
  println("nestedClasses: ${c.nestedClasses}")
  println("objectInstance: ${c.objectInstance}")
  println("qualifiedName: ${c.qualifiedName}")
  println("simpleName: ${c.simpleName}")
  println("supertypes: ${c.supertypes}")
  println("typeParameters: ${c.typeParameters}")
  println("visibility: ${c.visibility}")
  println("annotations: ${c.annotations}")
}

data class Foo(val s: String)

fun main(args: Array<String>) {
  val s = Foo("Hello")
  typeinfo(s)
}
