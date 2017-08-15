// extensionFunctions/MemberVsExtension.kt
import atomicTest.eq

class My {
  fun foo() = 1
}

fun My.foo() = 2

fun main(args: Array<String>) {
  My().foo() eq 1
}
