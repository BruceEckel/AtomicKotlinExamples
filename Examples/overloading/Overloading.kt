// overloading/Overloading.kt
import atomicTest.eq

class Overloading1 {
  fun f(): Int = 88
  fun f(n: Int): Int = n + 2
}

class Overloading2 {
  fun f(): Int = 99
  fun f(n: Int): Int = n + 3
}

fun main(args: Array<String>) {
  val mo1 = Overloading1()
  val mo2 = Overloading2()
  mo1.f() eq 88
  mo1.f(11) eq 13
  mo2.f() eq 99
  mo2.f(11) eq 14
}
