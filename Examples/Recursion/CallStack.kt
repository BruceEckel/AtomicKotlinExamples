// Recursion/CallStack.kt
package recursion

fun foo() {
  // Uncomment this line to get an exception:
  // throw IllegalStateException("Foo")
}

fun bar() {
  foo()
}

fun main(args: Array<String>) {
  bar()
}
