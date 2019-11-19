// Summary2/ASCIIMap.kt
import atomictest.eq

fun main() {
  val ascii = mapOf(
    "A" to 65,
    "B" to 66,
    "C" to 67,
    "I" to 73,
    "J" to 74,
    "K" to 75
  )
  ascii eq
    "{A=65, B=66, C=67, I=73, J=74, K=75}"
  ascii["B"] eq 66                   // [1]
  ascii.keys eq "[A, B, C, I, J, K]"
  ascii.values eq
    "[65, 66, 67, 73, 74, 75]"
  for (entry in ascii) {             // [2]
    print("${entry.key}:${entry.value},")
  }
  println()
  for ((key, value) in ascii)        // [3]
    print("$key:$value,")
  println()
  val mutable = ascii.toMutableMap() // [4]
  mutable.remove("I")
  mutable eq
    "{A=65, B=66, C=67, J=74, K=75}"
  mutable.put("Z", 90)
  mutable eq
    "{A=65, B=66, C=67, J=74, K=75, Z=90}"
  mutable.clear()
  mutable["A"] = 100
  mutable eq "{A=100}"
}
/* Output:
{A=65, B=66, C=67, I=73, J=74, K=75}
66
[A, B, C, I, J, K]
[65, 66, 67, 73, 74, 75]
A:65,B:66,C:67,I:73,J:74,K:75,
A:65,B:66,C:67,I:73,J:74,K:75,
{A=65, B=66, C=67, J=74, K=75}
{A=65, B=66, C=67, J=74, K=75, Z=90}
{A=100}
*/
