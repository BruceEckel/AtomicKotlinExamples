// ExtensionLambdas/Transform.kt
package extensionlambdas
import atomictest.eq

val duplicate: String.(Int) -> String = {
  repeat(it)
}

val alternate: String.(Int) -> String = {
  toCharArray()
    .filterIndexed { i, _ -> i % it == 0 }
    .joinToString("")
}

fun String.transform1(
  n: Int, lambda: (String, Int) -> String
) = lambda(this, n)

fun String.transform2(
  n: Int, lambda: String.(Int) -> String
) = lambda(this, n)

fun main() {
  "hello".transform1(5, duplicate)
    .transform2(3, alternate) eq "hleolhleo"
  "hello".transform2(5, duplicate)
    .transform1(3, alternate) eq "hleolhleo"
}
