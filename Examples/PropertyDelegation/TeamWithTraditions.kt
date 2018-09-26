// PropertyDelegation/TeamWithTraditions.kt
import atomictest.eq
import kotlin.properties.Delegates

class TeamWithTraditions {
  var captain: String
    by Delegates.vetoable("Adam") {
      _, old, new ->
      val canChange = new.startsWith("A")
      if (canChange)
        println("$old -> $new")
      else
        println("It's tradition, sorry $new")
      canChange
    }
}

fun main() {
  val team = TeamWithTraditions()
  team.captain = "Amanda"
  team.captain = "Bill"
  team.captain eq "Amanda"
}
/* Output:
Adam -> Amanda
It's tradition, sorry Bill
Amanda
*/
