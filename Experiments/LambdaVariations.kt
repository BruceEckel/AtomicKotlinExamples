// lambdas/LambdaVariations.kt

class Lambdas {
  val bare = {}
  val oneArg = { i: Int -> i * 2 }
  //val oneArg2 = { i -> i * 2 }
  val oneArg3 = { it * 2 }
  val twoArgs = { i: Int, n: Int -> i * n }
}
