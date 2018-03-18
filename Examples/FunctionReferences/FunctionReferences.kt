// FunctionReferences/FunctionReferences.kt
package functionreferences
import atomictest.eq

fun f() = "fun f()"
val rf = ::f             // [1]
val rl = { "lambda" }

fun main(args: Array<String>) {
  f() eq "fun f()"
  rf() eq "fun f()"      // [2]
  rl() eq "lambda"
}
