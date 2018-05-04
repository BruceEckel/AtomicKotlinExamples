// NamedAndDefaultArgs/TrimMargin.kt
import atomictest.eq

fun main(args: Array<String>) {
  val poem = """
    |Last night I saw upon the stair
          |A little man who wasn't there
                |He wasn't there again today
|Oh, how I wish he'd go away.""".trimMargin()
  poem eq
"""Last night I saw upon the stair
A little man who wasn't there
He wasn't there again today
Oh, how I wish he'd go away."""
}
