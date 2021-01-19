// DelegationTools/DelegToolsSoln2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package propertyDelegationToolsExercise3
import kotlin.properties.Delegates.observable
import kotlin.reflect.KProperty
import atomictest.*

fun <T> observe(
  prop: KProperty<*>, old: T, new: T
) {
  trace("${prop.name} $old to $new")
}

class Product(nm: String = "<0>", id: Int = -1) {
  var name by observable(nm, ::observe)
  var ident by observable(id, ::observe)
  override fun toString() = "$name $ident"
}

fun main() {
  val product = Product()
  product.name = "Plumbus"
  product.ident = 1193
  product eq "Plumbus 1193"
  trace eq """
    name <0> to Plumbus
    ident -1 to 1193
  """
}
