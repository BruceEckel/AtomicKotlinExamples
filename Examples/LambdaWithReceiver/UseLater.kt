// LambdaWithReceiver/UseLater.kt
package lambdawithreceiver

val sum = fun Int.(other: Int) = this + other

val sum2: Int.(Int) -> Int = {
  other -> this + other
}

fun main(args: Array<String>) {
  println(1.sum(2))
  println(1.sum2(2))
}
