// LambdaWithReceiver/FunctionLiterals.kt
package lambdawithreceiver
import atomictest.eq

fun f0(fl: () -> Unit) = fl()
fun f1(fl: (Int) -> Int) = fl(1)
fun f2(fl: (Int, Int) -> Int) = fl(2, 3)
fun f3(fl: (Int, Int, Int) -> Int) = fl(4,5,6)

fun main(args: Array<String>) {
  f0 { 1 } eq Unit
  f1 { it * 2 } eq 2
  f2 { a, b -> a * b } eq 6
  f3 { a, b, c -> a * b + c } eq 26
}
