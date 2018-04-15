// NamedAndDefaultArgs/TrimMargin.kt
import atomictest.eq

fun main(args: Array<String>) {
  val poem = """
    |I went down to the river,
    |I sat down on the bank.
    |I tried to think but couldn't,
    |So I jumped in and sank.""".trimMargin()
  poem eq
"""I went down to the river,
I sat down on the bank.
I tried to think but couldn't,
So I jumped in and sank."""
}
