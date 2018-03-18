// OperatorOverloading/StringInvoke.kt
import atomictest.eq

operator fun String.invoke(
  f: (s: String) -> String
) = f(this)

fun main(args: Array<String>) {
  "mumbling" { it.toUpperCase() } eq
    "MUMBLING"
}
