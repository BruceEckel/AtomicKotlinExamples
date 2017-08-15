// summary2/ClassBodies.kt
class NoBody

class SomeBody {
  val name = "Janet Doe"
}

class EveryBody {
  val all = listOf(SomeBody(),
      SomeBody(), SomeBody())
}

fun main(args: Array<String>) {
  val nb = NoBody()
  val sb = SomeBody()
  val eb = EveryBody()
}
