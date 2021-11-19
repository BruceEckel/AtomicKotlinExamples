// Lists/PlusAssignPuzzle.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
    // Mutable List assigned to a 'val'/'var':
    val list1 = mutableListOf('A') // or 'var'
    list1 += 'A' // Is the same as:
    list1.plusAssign('A')               // [1]

    // Immutable List assigned to a 'val':
    val list2 = listOf('B')
    // list2 += 'B' // Is the same as:
    // list2 = list2 + 'B'              // [2]

    // Immutable List assigned to a 'var':
    var list3 = listOf('C')
    list3 += 'C' // Is the same as:
    val newList = list3 + 'C'           // [3]
    list3 = newList                     // [4]

    list1 eq "[A, A, A]"
    list2 eq "[B]"
    list3 eq "[C, C, C]"
}
