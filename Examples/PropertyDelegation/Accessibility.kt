// PropertyDelegation/Accessibility.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package propertydelegation
import atomictest.eq
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class Person(
  private val first: String,
  private val last: String
) {
  val name by     // SAM conversion:
  ReadOnlyProperty<Person, String> { _, _ ->
    "$first $last"
  }
}

fun main() {
  val alien = Person("Floopy", "Noopers")
  alien.name eq "Floopy Noopers"
}
