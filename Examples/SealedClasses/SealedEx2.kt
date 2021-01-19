// SealedClasses/SealedEx2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package sealedClassesExercise2
import sealedClassesExercise1.*
import atomictest.*

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
