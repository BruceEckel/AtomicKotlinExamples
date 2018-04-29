// Summary2/MustableVsImmutableList.kt
import atomictest.eq

fun main(args: Array<String>) {
  val ints = listOf(99, 3, 5, 7, 11, 13)
  // ints.add(9) // 'add()' not available
  for (i in ints)
    if(i > 11)
      println(i)
  val chars = mutableListOf('i', 'j', 'k')
  chars.add('l') // 'add()' available
  println(chars)
  chars.remove('k')
  println(chars)
  chars.clear()
  println(chars)
}
/* Output:
99
13
[i, j, k, l]
[i, j, l]
[]
*/
