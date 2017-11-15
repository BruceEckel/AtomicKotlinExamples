// Recursion/Factorial.kt
package recursion
import bigint.*
import atomictest.*

tailrec fun
factorial(n: Int, acc: BigInt = one): BigInt {
  if(n == 1)
    return acc
  return factorial(n - 1, acc * n.big)
}

fun main(args: Array<String>) {
  factorial(12) eq 479001600.big
  factorial(17) eq "355687428096000".big
  factorial(30) eq
    "265252859812191058636308480000000".big
  factorial(50) eq
    ("3041409320171337804361260816606476" +
    "8844377641568960512000000000000").big
}
