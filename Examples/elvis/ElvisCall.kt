// Elvis/ElvisCall.kt
import atomictest.eq

fun check(s: String?, len: Int) {   // [1]
  val length1 =
    if (s != null) s.length else 0  // [2]
  val length2 = s?.length ?: 0      // [3]
  length1 eq len
  length2 eq len
}

fun main(args: Array<String>) {
  check("abc", 3)
  check(null, 0)
}
