// BaseInit/AuxiliaryInitialization.kt
import atomictest.eq

open class House(
  val address: String,
  val state: String,
  val zip: String
) {
  constructor(state: String, zip: String):
    this("address?", state, zip)
  constructor(zip: String):
    this("address?", "state?", zip)
}

class Home(
  address: String,
  state: String,
  zip: String,
  val name: String
): House(address, state, zip) {
  override fun toString() =
    "$name: $address, $state $zip"
}

class VacationHouse(
  state: String,
  zip: String,
  val startMonth: Int,
  val endMonth: Int
): House(state, zip)

class TreeHouse(
  val name: String, zip: String
): House(zip)

fun main(args: Array<String>) {
  val h = Home("88 Target St.", "KS",
    "66632", "Metropolis")
  h.address eq "88 Target St."
  h.state eq "KS"
  h.name eq "Metropolis"
  h eq "Metropolis: 88 Target St., KS 66632"

  val v = VacationHouse("KS", "66632", 6, 8)
  v.state eq "KS"
  v.startMonth eq 6
  v.endMonth eq 8

  val tree = TreeHouse("Oak", "48104")
  tree.name eq "Oak"
  tree.zip eq "48104"
}
