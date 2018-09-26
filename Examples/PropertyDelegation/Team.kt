// PropertyDelegation/Team.kt
import kotlin.properties.Delegates

class Team {
  var captain: String by
  Delegates.observable("<none>") {
    prop, old, new ->
    println("$prop $old to $new")
  }
}

fun main() {
  val team = Team()
  team.captain = "Adam"
  team.captain = "Amanda"
}
/* Output:
var Team.captain: kotlin.String <none> to Adam
var Team.captain: kotlin.String Adam to Amanda
*/
