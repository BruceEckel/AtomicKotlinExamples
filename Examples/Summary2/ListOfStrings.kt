// Summary2/ListOfStrings.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.

fun main() {
  val jabber = """
    Twas brillig, and the slithy toves
      Did gyre and gimble in the wabe:
    All mimsy were the borogoves,
      And the mome raths outgrabe.
  """.trim().split(Regex("\\W+"))

  println(jabber.take(5))
  println(jabber.slice(6..12))
  println(jabber.slice(6..18 step 2))
  println(jabber.sorted().takeLast(5))
  println(
    jabber.sorted().distinct().takeLast(5))
}
/* Output:
[Twas, brillig, and, the, slithy]
[Did, gyre, and, gimble, in, the, wabe]
[Did, and, in, wabe, mimsy, the, And]
[the, the, toves, wabe, were]
[slithy, the, toves, wabe, were]
*/
