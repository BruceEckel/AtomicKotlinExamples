// PropertyDelegation/TeamWithTraditions.kt
import atomictest.eq
import kotlin.properties.Delegates

class TeamWithTraditions {
  var captain: String by Delegates.vetoable("Adam") {
    _, old, new ->
    val canChange = new.startsWith("A")
    if (canChange) {
      println("Changed from $old to $new")
    } else {
      println("Can't break traditions, sorry $new")
    }
    canChange
  }
}

fun main(args: Array<String>) {
  val team = TeamWithTraditions()
  team.captain = "Amanda"
  team.captain = "Bill"
  team.captain eq "Amanda"
}
/* Output:
Changed from Adam to Amanda
Can't break traditions, sorry Bill
Amanda
*/
