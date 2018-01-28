// Overloading/Overloading.kt
import atomictest.eq

class Overloading1 {
  fun f() = 88
  fun f(n: Int) = n + 2
}

class Overloading2 {
  fun f() = 99
  fun f(n: Int) = n + 3
}

fun main(args: Array<String>) {
  val mo1 = Overloading1()
  mo1.f() eq 88
  mo1.f(11) eq 13

  val mo2 = Overloading2()
  mo2.f() eq 99
  mo2.f(11) eq 14
}
