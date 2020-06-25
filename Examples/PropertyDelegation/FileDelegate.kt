// PropertyDelegation/FileDelegate.kt
package propertydelegation
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty
import checkinstructions.DataFile

open class FileDelegate:
  ReadWriteProperty<Any?, String> {
  override fun getValue(
    thisRef: Any?,
    property: KProperty<*>
  ): String {
    val file =
      DataFile(property.name + ".txt")
    return if (file.exists())
      file.readText()
    else ""
  }
  override fun setValue(
    thisRef: Any?,
    property: KProperty<*>,
    value: String
  ) {
    DataFile(property.name + ".txt")
      .writeText(value)
  }
}
