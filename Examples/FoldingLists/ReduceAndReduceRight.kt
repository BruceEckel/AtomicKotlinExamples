// FoldingLists/ReduceAndReduceRight.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val chars = "A B C D E F G H I".split(" ")
  chars.fold("X") { a, e -> "$a $e"} eq
    "X A B C D E F G H I"
  chars.foldRight("X") { a, e -> "$a $e" } eq
    "A B C D E F G H I X"
  chars.reduce { a, e -> "$a $e" } eq
    "A B C D E F G H I"
  chars.reduceRight { a, e -> "$a $e" } eq
    "A B C D E F G H I"
}
