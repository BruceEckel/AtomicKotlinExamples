// PropertyDelegation/NickName.kt
package propertydelegation
import atomictest.eq
import kotlin.reflect.KProperty

class Person(
  val formal: String, val nickName: String) {
  var casual = false
  val name by NickName()
}

class NickName() {
  operator fun
  getValue(p: Person, prop: KProperty<*>) =
    "'$prop' " +
      if(p.casual) p.nickName else p.formal
}

fun main(args: Array<String>) {
  val babs = Person("Barbara", "Babs")
  babs.name eq
  "'val Person.name: kotlin.String' Barbara"
  babs.casual = true
  babs.name eq
  "'val Person.name: kotlin.String' Babs"
}
