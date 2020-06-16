// PropertyDelegation/Accessibility.kt
package propertydelegation
import atomictest.eq
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class Person(
  private val first: String,
  private val last: String
) {
  val name by Name()
  class Name:
    ReadOnlyProperty<Person, String> {
    override fun getValue(
      thisRef: Person, property: KProperty<*>
    ) = "${thisRef.first} ${thisRef.last}"
  }
}

fun main() {
  val alien = Person("Floopy", "Noopers")
  alien.name eq "Floopy Noopers"
}
