// NamedAndDefaultArgs/Evaluation.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package namedanddefault

class DefaultArg
val da = DefaultArg()

fun g(d: DefaultArg = da) = println(d)

fun h(d: DefaultArg = DefaultArg()) =
  println(d)

fun main() {
  g()
  g()
  h()
  h()
}
/* Sample output:
namedanddefault.DefaultArg@7440e464
namedanddefault.DefaultArg@7440e464
namedanddefault.DefaultArg@49476842
namedanddefault.DefaultArg@78308db1
*/
