fun except(f: () -> String) =
  try {
    f()
  } catch(e: Exception) {
    e.message
  }

fun main(args: Array<String>) {
  println(except { throw Exception("bar") })
}
