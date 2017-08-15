// classDelegation/ModelingMultipleInheritance.kt
import atomicTest.eq

interface Foo {
  fun foo(): String
}

class FooImpl : Foo {
  override fun foo() = "foo"
}

interface Bar {
  fun bar(): String
}

class BarImpl : Bar {
  override fun bar() = "bar"
}

// Even if we make the classes open, we'll get an error:
// Only one class may appear in a supertype list
//class B : FooImpl(), BarImpl()

class FooBar(val foo: Foo, val bar: Bar) : Foo by foo, Bar by bar

fun main(args: Array<String>) {
  val fooBar = FooBar(FooImpl(), BarImpl())
  fooBar.foo() eq "foo"
  fooBar.bar() eq "bar"
}
