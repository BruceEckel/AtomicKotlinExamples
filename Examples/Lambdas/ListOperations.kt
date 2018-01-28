// Lambdas/ListOperations.kt
import atomictest.eq

fun main(args: Array<String>) {
  // Index is passed as lambda argument:
  val list1 = List(10) { it }
  list1 eq "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]"
  // List of a single value:
  val list2 = List(10) { 9 }
  list2 eq "[9, 9, 9, 9, 9, 9, 9, 9, 9, 9]"
  // Manufacture a list of letters:
  val list3 = List(10) { 'a' + it }
  list3 eq "[a, b, c, d, e, f, g, h, i, j]"
  // Cycle through a sequence:
  val list4 = List(10) { list3[it % 3] }
  list4 eq "[a, b, c, a, b, c, a, b, c, a]"
  // Some of the many List operations:
  list1.first() eq 0
  list1.last() eq 9
  list3.min() eq 'a'
  list3.max() eq 'j'
  list3.drop(3) eq "[d, e, f, g, h, i, j]"
  list3.dropLast(3) eq "[a, b, c, d, e, f, g]"
  list3.take(3) eq "[a, b, c]"
  list3.takeLast(3) eq "[h, i, j]"
  list3.contains('d') eq true
  list4.distinct().count() eq 3
  list1.filter { it > 3 && it % 2 == 0 } eq
    "[4, 6, 8]"
  list3.intersect(list4) eq "[a, b, c]"
  list3.minus(list4) eq
    "[d, e, f, g, h, i, j]"
  list1.partition { it % 2 == 0 } eq
    "([0, 2, 4, 6, 8], [1, 3, 5, 7, 9])"
  // And many more ...
}
