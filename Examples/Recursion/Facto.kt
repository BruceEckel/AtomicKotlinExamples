// Recursion/Facto.kt
import bigint.*
import atomictest.*

fun facto(n: BigInt): BigInt {
  assert(n >= zero)
  if(n <= one)
    return one
  return n * facto(n - one)
}

fun main(args: Array<String>) {
  facto(12.big) eq 479001600.big
  facto(17.big) eq "355687428096000".big
  facto(30.big) eq
    "265252859812191058636308480000000".big
  facto(50.big) eq
    ("3041409320171337804361260816606476" +
     "8844377641568960512000000000000").big
}
