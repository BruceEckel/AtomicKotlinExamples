// DelegationTools/TeamWithTraditions.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package delegationtools
import atomictest.*
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

fun aName(
  property: KProperty<*>,
  old: String,
  new: String
) = if (new.startsWith("A")) {
  trace("$old -> $new")
  true
} else {
  trace("Name must start with 'A'")
  false
}

interface Captain {
  var captain: String
}

class TeamWithTraditions : Captain {
  override var captain: String
    by Delegates.vetoable("Adam", ::aName)
}

class TeamWithTraditions2 : Captain {
  override var captain: String
    by Delegates.vetoable("Adam") {
      _, old, new ->
        if (new.startsWith("A")) {
          trace("$old -> $new")
          true
        } else {
          trace("Name must start with 'A'")
          false
        }
    }
}

fun main() {
  listOf(
    TeamWithTraditions(),
    TeamWithTraditions2()
  ).forEach {
    it.captain = "Amanda"
    it.captain = "Bill"
    it.captain eq "Amanda"
  }
  trace eq """
    Adam -> Amanda
    Name must start with 'A'
    Adam -> Amanda
    Name must start with 'A'
  """
}
