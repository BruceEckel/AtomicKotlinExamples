// PropertyDelegation/Configuration.kt
package propertydelegation
import checkinstructions.DataFile
import atomictest.eq

class Configuration {
  var user by FileDelegate()
  var id by FileDelegate()
  var project by FileDelegate()
}

fun main() {
  val config = Configuration()
  config.user = "Luciano"
  config.id = "Ramalho47"
  config.project = "MyLittlePython"
  DataFile("user.txt").readText() eq "Luciano"
  DataFile("id.txt").readText() eq "Ramalho47"
  DataFile("project.txt").readText() eq
    "MyLittlePython"
}
