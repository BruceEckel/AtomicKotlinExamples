// FunctionReferences/LambdaAsReference.kt
package importanceoflambdas
import atomictest.eq

val lr = { "lambda" }
fun f() = "fun f()"
val fr = ::f

fun main(args: Array<String>) {
  lr() eq "lambda"
  f() eq "fun f()"
  fr() eq "fun f()"
}
