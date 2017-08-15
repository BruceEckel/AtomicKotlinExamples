// varargsAndArrays/TwoFunctionsWithVarargs.kt
fun firstVarargFun(vararg numbers: Int) {
  println("varargs:")
  for (n in numbers) {
    print("$n ")
  }
}

fun secondVarargFun(vararg numbers: Int) {
  firstVarargFun(*numbers)
}

fun main(args: Array<String>) {
  secondVarargFun(1, 2, 3)
}
/* Output:
varargs:
1 2 3
*/
