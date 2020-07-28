// CreatingGenerics/BasicGenerics.kt
package creatinggenerics

fun <T> genericFunction(arg: T): T = arg

class GenericClass<T>(val x: T) {
  fun f(): T = x
}

class GenericMemberFunction {
  fun <T> f(arg: T): T = arg
}

interface GenericInterface<T> {
  val x: T
  fun f(): T
}

class GenericImplementation<T>(
  override val x: T
) : GenericInterface<T> {
  override fun f(): T = x
}

fun basicGenerics() {
  genericFunction("Yellow")
  genericFunction(1)
  genericFunction(Dog()).bark()   // [1]
  genericFunction<Dog>(Dog()).bark()

  GenericClass("Cyan").f()
  GenericClass(11).f()
  GenericClass(Dog()).f().bark()  // [2]
  GenericClass<Dog>(Dog()).f().bark()

  GenericMemberFunction().f("Amber")
  GenericMemberFunction().f(111)
  GenericMemberFunction().f(Dog()).bark() // [3]
  GenericMemberFunction().f<Dog>(Dog()).bark()

  GenericImplementation("Cyan").f()
  GenericImplementation(11).f()
  GenericImplementation(Dog()).f().bark()
}
