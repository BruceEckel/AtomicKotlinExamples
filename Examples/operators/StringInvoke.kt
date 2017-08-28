// operators/StringInvoke.kt

operator fun String.invoke(f: (s:String) -> String) = f(this)

fun main(args: Array<String>) {
  val s = "mumbling" { it.toUpperCase() }
  println(s)
}
