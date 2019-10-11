// Summary2/ReadonlyVsMutableList.kt
import atomictest.eq

fun main() {
  val ints = listOf(5, 13, 9)
  // ints.add(11) // 'add()' not available
  for(i in ints)
    if(i > 10)
      println(i)

  val chars = mutableListOf('a', 'b', 'c')
  chars.add('d') // 'add()' available
  chars += 'e'
  println(chars)
}
/* Output:
13
[a, b, c, d, e]
*/
