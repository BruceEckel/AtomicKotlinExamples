// Summary2/ASCIIMap.kt

fun main() {
  val ascii = mapOf(
    "A" to 65,
    "B" to 66,
    "C" to 67,
    "D" to 68,
    "I" to 73,
    "J" to 74,
    "K" to 75
  )
  println(ascii)
  println(ascii["B"])                 // [1]
  println(ascii.keys)
  println(ascii.values)
  for(entry in ascii)                 // [2]
    print("${entry.key}:${entry.value},")
  println()
  for((key, value) in ascii)          // [3]
    print("$key:$value,")
  println()
  val mutable = ascii.toMutableMap()  // [4]
  mutable.remove("I")
  println(mutable)
  mutable.put("Z", 90)
  println(mutable)
  mutable.clear()
  mutable["A"] = 100
  println(mutable)
}
/* Output:
{A=65, B=66, C=67, D=68, I=73, J=74, K=75}
66
[A, B, C, D, I, J, K]
[65, 66, 67, 68, 73, 74, 75]
A:65,B:66,C:67,D:68,I:73,J:74,K:75,
A:65,B:66,C:67,D:68,I:73,J:74,K:75,
{A=65, B=66, C=67, D=68, J=74, K=75}
{A=65, B=66, C=67, D=68, J=74, K=75, Z=90}
{A=100}
*/
