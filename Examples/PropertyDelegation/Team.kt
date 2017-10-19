// PropertyDelegation/Team.kt
import kotlin.properties.Delegates

class Team {
  var captain: String by Delegates.observable("<not chosen>") {
    _, old, new ->
    println("Changed from $old to $new")
  }
}

fun main(args: Array<String>) {
  val team = Team()
  team.captain = "Adam"
  team.captain = "Amanda"
}
/* Output:
Changed from <not chosen> to Adam
Changed from Adam to Amanda
*/
