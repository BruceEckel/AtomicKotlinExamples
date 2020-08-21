// PropertyDelegation/FileDelegate.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package propertydelegation
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty
import checkinstructions.DataFile

class FileDelegate:
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
