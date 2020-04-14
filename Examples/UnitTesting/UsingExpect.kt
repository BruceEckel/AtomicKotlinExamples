// UnitTesting/UsingExpect.kt
package unittesting
import kotlin.test.*

fun testFoo2() = expect(42, "Wrong answer") {
  foo()  
}

fun main() {
  testFoo2()
}
