// Generics/Describe.kt

fun describe(x: Any) =
  println(x::class.simpleName)

fun main(args: Array<String>) {
  describe("")
  describe(1)
  describe(1.0)
  describe(1.0F)
  describe('c')
}
