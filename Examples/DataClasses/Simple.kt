// DataClasses/Simple.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

data class Simple(
  val arg1: String,
  var arg2: Int
)

fun main() {
  val s1 = Simple("Hi", 29)
  val s2 = Simple("Hi", 29)
  s1 eq s2
}
/* Output:
Simple(arg1=Hi, arg2=29)
*/
