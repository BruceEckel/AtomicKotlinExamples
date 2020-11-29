// FoldingLists/FoldRight.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf('a', 'b', 'c', 'd')
  list.fold("*") { acc, elem ->
    "($acc) + $elem"
  } eq "((((*) + a) + b) + c) + d"
  list.foldRight("*") { elem, acc ->
    "$elem + ($acc)"
  } eq "a + (b + (c + (d + (*))))"
}
