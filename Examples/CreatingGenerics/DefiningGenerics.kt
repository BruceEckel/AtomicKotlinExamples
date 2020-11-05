// CreatingGenerics/DefiningGenerics.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics

fun <T> gFunction(arg: T): T = arg

class GClass<T>(val x: T) {
  fun f(): T = x
}

class GMemberFunction {
  fun <T> f(arg: T): T = arg
}

interface GInterface<T> {
  val x: T
  fun f(): T
}

class GImplementation<T>(
  override val x: T
) : GInterface<T> {
  override fun f(): T = x
}

class ConcreteImplementation
  : GInterface<String> {
  override val x: String
    get() = "x"
  override fun f() = "f()"
}

fun basicGenerics() {
  gFunction("Yellow")
  gFunction(1)
  gFunction(Dog()).bark()             // [1]
  gFunction<Dog>(Dog()).bark()

  GClass("Cyan").f()
  GClass(11).f()
  GClass(Dog()).f().bark()            // [2]
  GClass<Dog>(Dog()).f().bark()

  GMemberFunction().f("Amber")
  GMemberFunction().f(111)
  GMemberFunction().f(Dog()).bark()   // [3]
  GMemberFunction().f<Dog>(Dog()).bark()

  GImplementation("Cyan").f()
  GImplementation(11).f()
  GImplementation(Dog()).f().bark()

  ConcreteImplementation().f()
  ConcreteImplementation().x
}
