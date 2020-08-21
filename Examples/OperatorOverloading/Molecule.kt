// OperatorOverloading/Molecule.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

data class Molecule(
  val id: Int = idCount++,
  var attached: Molecule? = null
) {
  companion object {
    private var idCount = 0
  }
  operator fun plus(other: Molecule) {
    attached = other
  }
}

fun main() {
  val m1 = Molecule()
  val m2 = Molecule()
  m1 + m2                      // [1]
  m1 eq "Molecule(id=0, attached=" +
    "Molecule(id=1, attached=null))"
}
