// NamedAndDefaultArgs/Evaluation.kt

class DefaultArg

fun h(d: DefaultArg = DefaultArg()) =
  println(d)

fun main(args: Array<String>) {
  h()
  h()
}
/* Sample output:
DefaultArg@28d93b30
DefaultArg@1b6d3586
*/
