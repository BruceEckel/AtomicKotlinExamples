// LambdaWithReceiver/Syntax.kt

class Klass2 {
  fun f1(): Int = 1
  fun f2(n: Int): Int = 2 * n
}

// Pass receiver to the lambda:
fun useF1(k: Klass2,
  f: Klass2.() -> Int) = k.f()
fun useF2(k: Klass2,
  f: Klass2.(n: Int) -> Int,
  na: Int) = k.f(na)
fun useBoth(k: Klass2,
  f1: Klass2.() -> Int,
  f2: Klass2.(n: Int) -> Int,
  na: Int) = k.f1() + k.f2(na)

// Use extension methods:
fun Klass2.useF1e(
  f: Klass2.() -> Int) = f()
fun Klass2.useF2e(
  f: Klass2.(n: Int) -> Int,
  na: Int) = f(na)
fun Klass2.useBothe(
  f1: Klass2.() -> Int,
  f2: Klass2.(n: Int) -> Int,
  na: Int) = f1() + f2(na)


fun main(args: Array<String>) {
  val k = Klass2()
  useF1(k, Klass2::f1)
  useF2(k, Klass2::f2, 11)
  useBoth(k, Klass2::f1, Klass2::f2, 11)
  k.useF1e(Klass2::f1)
  k.useF2e(Klass2::f2, 11)
  k.useBothe(Klass2::f1, Klass2::f2, 11)
}
