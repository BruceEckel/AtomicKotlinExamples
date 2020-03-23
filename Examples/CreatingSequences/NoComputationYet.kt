// CreatingSequences/NoComputationYet.kt
package creatingsequences

fun main() {
  val list = listOf(1, 2, 3, 4)
  val r = list.asSequence()
    .filter(Int::isEven)
    .map(Int::square)
  println(r)
}
/* Sample output:
kotlin.sequences.TransformingSequence@1218025c
*/
