// Generics/Describe.kt
import atomictest.eq

//fun <T: Any> describe(x: T) = x::class.simpleName
fun describe(x: Any) = x::class.simpleName

fun main(args: Array<String>) {
  describe("") eq "String"
  describe(1) eq "Int"
  describe(1.0) eq "Double"
  describe(1.0F) eq "Float"
  describe('c') eq "Char"
}
