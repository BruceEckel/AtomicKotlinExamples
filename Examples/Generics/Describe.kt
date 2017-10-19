// Generics/Describe.kt

fun <T: Any> describe(x: T) =
  println(x::class.simpleName)

fun main(args: Array<String>) {
  describe("")
  describe(1)
  describe(1.0)
  describe(1.0F)
  describe('c')
}
