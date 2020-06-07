// PropertyDelegation/PropDelegationSoln3.kt
package propertydelegationsoln3
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty
import checkinstructions.DataFile
import atomictest.eq

class Configuration {
  var user: String by DataDelegate()
  var id: String by DataDelegate()
}

class DataDelegate :
  ReadWriteProperty<Configuration, String> {
  override fun getValue(
    config: Configuration,
    property: KProperty<*>
  ): String {
    val file =
      DataFile(property.name + ".txt")
    return if (file.exists())
      file.readText()
    else ""
  }
  override fun setValue(
    config: Configuration,
    property: KProperty<*>, value: String
  ) {
    DataFile(property.name + ".txt")
      .writeText(value)
  }

}

fun main() {
  val config = Configuration()
  config.user = "Luciano"
  config.id = "Ramalho47"
  DataFile("user.txt").readText() eq "Luciano"
  DataFile("id.txt").readText() eq "Ramalho47"
}
