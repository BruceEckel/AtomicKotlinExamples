// CompanionObjects/NamedCompanionObject.kt
import atomictest.eq

class WithNamed {
  companion object Named {
    fun s() = "from Named"
  }
}

fun main(args: Array<String>) {
  WithNamed.s() eq "from Named"
  WithNamed.Named.s() eq "from Named"
}
