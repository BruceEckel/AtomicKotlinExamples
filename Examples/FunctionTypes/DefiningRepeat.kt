// FunctionTypes/DefiningRepeat.kt
package definingrepeat

fun repeat(
  times: Int,
  action: (Int) -> Unit           // [1]
) {
  for (index in 0 until times)
    action(index)                 // [2]
}

fun main() {
  repeat(3) { println("#$it") }   // [3]
}
/* Output:
#0
#1
#2
*/
