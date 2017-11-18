// PropertyDelegation/Team.kt
import kotlin.properties.Delegates
import atomictest.*

class Team {
  var captain: String by
  Delegates.observable("<none>") {
    prop, old, new ->
    trace("$prop $old to $new")
  }
}

fun main(args: Array<String>) {
  val team = Team()
  team.captain = "Adam"
  team.captain = "Amanda"
  trace eq """
var Team.captain: kotlin.String <none> to Adam
var Team.captain: kotlin.String Adam to Amanda
"""
}
