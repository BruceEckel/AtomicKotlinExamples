// CompanionObjects/NamingCompanionObjects.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

class WithNamed {
  companion object Named {
    fun s() = "from Named"
  }
}

class WithDefault {
  companion object {
    fun s() = "from Default"
  }
}

fun main() {
  WithNamed.s() eq "from Named"
  WithNamed.Named.s() eq "from Named"
  WithDefault.s() eq "from Default"
  // The default name is "Companion":
  WithDefault.Companion.s() eq "from Default"
}
