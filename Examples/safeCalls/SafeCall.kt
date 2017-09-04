// SafeCalls/SafeCall.kt
import atomictest.eq

fun check(s: String?, len: Int?) {
  val length1 =
    if(s != null) s.length else null // [1]
  val length2 = s?.length            // [2]
  length1 eq len
  length2 eq len
}

fun main(args: Array<String>) {
  check("abc", 3)
  check(null, null)
}
