// ImportanceOfLambdas/LambdaAsReference.kt
package importanceoflambdas

fun f() = "f"

fun main(args: Array<String>) {
  val lr = { "f" }
  val fr = ::f
}
