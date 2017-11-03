// PropertyDelegation/TeamWithTraditions.kt
import atomictest.*
import kotlin.properties.Delegates

class TeamWithTraditions {
  var captain: String
  by Delegates.vetoable("Adam") {
    _, old, new ->
    val canChange = new.startsWith("A")
    if(canChange)
      trace("$old -> $new")
    else
      trace("It's tradition, sorry $new")
    canChange
  }
}

fun main(args: Array<String>) {
  val team = TeamWithTraditions()
  team.captain = "Amanda"
  team.captain = "Bill"
  team.captain eq "Amanda"
  trace.result eq """
Adam -> Amanda
It's tradition, sorry Bill
"""
}
