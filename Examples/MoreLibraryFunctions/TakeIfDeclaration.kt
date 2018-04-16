// MoreLibraryFunctions/TakeIfDeclaration.kt
package takeIfDeclaration

import atomictest.eq

fun <T> T.takeIf(
    predicate: (T) -> Boolean
): T? {
  return if (predicate(this)) this else null
}

fun main(args: Array<String>) {
  "abc".takeIf { it != "XXX" } eq "abc"
  "XXX".takeIf { it != "XXX" } eq null
}
