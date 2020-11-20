// SafeCallsAndElvis/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package safeCallsAndTheElvisOperatorExercise2

import atomictest.eq

data class Client(
  val name: String,
  val personalInfo: PersonalInfo? = null)

data class PersonalInfo(
  val email: String? = null,
  val address: Address? = null)

data class Address(
  val country: String? = null,
  val city: String? = null,
  val street: String? = null)

fun Client.comesFromMunich(): Boolean =
  personalInfo?.address?.city == "Munich"

fun main() {
  val alice = Client("Alice",
    PersonalInfo(address = Address("Germany", "Munich")))
  alice.comesFromMunich() eq true
  Client("Bob").comesFromMunich() eq false
}
