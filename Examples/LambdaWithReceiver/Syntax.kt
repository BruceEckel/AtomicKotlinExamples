// LambdaWithReceiver/Syntax.kt
class Klass2 {
  fun f1(): Int { return 1 }
  fun f2(n: Int): Int { return 2 * n }
}

// Pass receiver to the lambda:
fun useF1(k: Klass2, f: Klass2.() -> Int) = k.f()
fun useF2(k: Klass2, f: Klass2.(n: Int) -> Int, na: Int) = k.f(na)

fun main(args: Array<String>) {
  val k = Klass2()
  useF1(k, Klass2::f1)
  useF2(k, Klass2::f2, 11)
}
