// PropertyDelegation/PropDelegationSoln1.kt
package propertydelegationsoln1
import atomictest.eq

class Configuration(
  val map: MutableMap<String, Any?>
) {
  var user: String by map
  var id: String by map
  var project: String by map
}

fun main() {
  val config = Configuration(mutableMapOf(
    "user" to "Luciano",
    "id" to "Ramalho47",
    "project" to "MyLittlePython",
  ))
  config.project eq "MyLittlePython"
  config.user = "Crocubot"
  config.id = "C137"
  config.project = "WhirlyDirly"
  config.map eq "{user=Crocubot, " +
    "id=C137, project=WhirlyDirly}"
}
