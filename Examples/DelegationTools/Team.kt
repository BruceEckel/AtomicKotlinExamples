// DelegationTools/Team.kt
package delegationtools
import kotlin.properties.Delegates.observable
import atomictest.eq

class Team {
  var msg = ""
  var captain: String by observable("<0>") {
    prop, old, new ->
      msg += "${prop.name} $old to $new, "
  }
}

fun main() {
  val team = Team()
  team.captain = "Adam"
  team.captain = "Amanda"
  team.msg eq "captain <0> to Adam, " +
    "captain Adam to Amanda, "
}
