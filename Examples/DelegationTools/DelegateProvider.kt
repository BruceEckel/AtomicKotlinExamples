// DelegationTools/DelegateProvider.kt
package delegationtools
import kotlin.reflect.KProperty
import atomictest.*

class Delegate<T>(private var value: T) {
  operator fun getValue(
    thisRef: Any?,
    property: KProperty<*>
  ): T {
    trace("getValue: $value")
    return value
  }
  operator fun setValue(
    thisRef: Any?,
    property: KProperty<*>,
    newValue: T
  ) {
    trace("setValue: $newValue")
    value = newValue
  }
}

class DelegateProvider<T>(val value: T) {
  operator fun provideDelegate(
    thisRef: Any?,
    property: KProperty<*>
  ): Delegate<T> {
    trace("providing Delegate($value)")
    return Delegate(value)
  }
}

fun <T> delegate(value: T):
  DelegateProvider<T> {
  trace("creating DelegateProvider($value)")
  return DelegateProvider(value)
}

fun main() {
  var x by delegate(3.14)
  trace("x created")
  var y by delegate("Hello")
  trace("y created")
  var z by DelegateProvider(true)
  trace("z created")
  x eq 3.14
  x = 1.62
  x eq 1.62
  y eq "Hello"
  y = "Goodbye"
  y eq "Goodbye"
  z eq true
  z = false
  z eq false
  trace eq """
    creating DelegateProvider(3.14)
    providing Delegate(3.14)
    x created
    creating DelegateProvider(Hello)
    providing Delegate(Hello)
    y created
    providing Delegate(true)
    z created
    getValue: 3.14
    setValue: 1.62
    getValue: 1.62
    getValue: Hello
    setValue: Goodbye
    getValue: Goodbye
    getValue: true
    setValue: false
    getValue: false
  """
}
