// TailRecursion/InfiniteRecursion.kt
package recursion

fun foo(i: Int): Int = foo(i + 1)

fun main(args: Array<String>) {
  // Uncomment this line to get an exception:
  // println(foo(1))
}
