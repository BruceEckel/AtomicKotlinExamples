// BreakAndContinue/JustTesting.kt

fun main(args: Array<String>) {
  (0 until 100 step 3).asSequence()
    .filterNot { it == 6 }
    .map { println(it); it }
    .first { it == 60 }
}
