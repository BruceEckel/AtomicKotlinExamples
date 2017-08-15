// expressionsAndStatements/ForLoopIsAStatement.kt
fun main(args: Array<String>) {
  // Can't do this:
  // val f = for (i in 1..10) {}
  // Compiler error message:
  // for is not an expression, and
  // only expressions are allowed here
}
