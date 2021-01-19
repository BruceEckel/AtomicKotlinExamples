// BuildingMaps/AssociateByUnique.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import buildingmaps.*
import atomictest.eq

fun main() {
  // associateBy() fails when the key isn't
  // unique -- values disappear:
  val ages = people().associateBy { it.age }
  ages eq mapOf(
    21 to Person("Franz", 21),
    15 to Person("Arthricia", 15),
    25 to Person("Bill", 25),
    42 to Person("Crocubot", 42),
    33 to Person("Revolio", 33))
}
