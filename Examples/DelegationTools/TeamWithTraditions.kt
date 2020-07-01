// DelegationTools/TeamWithTraditions.kt
package delegationtools
import atomictest.*
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

fun AName(
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

class TeamWithTraditions {
  var captain: String
    by Delegates.vetoable("Adam", ::AName)
}

fun main() {
  val team = TeamWithTraditions()
  team.captain = "Amanda"
  team.captain = "Bill"
  team.captain eq "Amanda"
  trace eq """
    Adam -> Amanda
    Name must start with 'A'
  """
}
