// Objects/Share2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package objectshare2
import objectsharing.Shared
import objectshare1.f
import atomictest.eq

fun g() {
  Shared.i += 7
}

fun main() {
  f()
  g()
  Shared.i eq 12
}
