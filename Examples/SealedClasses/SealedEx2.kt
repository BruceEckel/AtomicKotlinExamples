// SealedClasses/SealedEx2.kt
package sealedclassesex1
import atomictest.*

private val trace = Trace()

fun main() {
  Transport::class.sealedSubclasses
    .map { it.simpleName }
    .forEach { trace(it) }
  trace eq """
  Train
  Bus
  Tram
  Plane
  """
}
