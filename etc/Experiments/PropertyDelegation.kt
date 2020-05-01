import kotlin.reflect.*

class Delegator {
  var property by Delegate()
  override fun toString() = "Delegator"
}

class Delegate {
  operator fun getValue(delegator: Any?,
    prop: KProperty<*>): String {
    return "$delegator getValue() for '${prop.name}'"
  }
  operator fun setValue(delegator: Any?,
    prop: KProperty<*>, value: String) {
    println("$delegator setValue() '${prop.name}' = $value")
  }
}

fun main(args: Array<String>) {
  val d = Delegator()
  println(d.property)
  d.property = "Howdy!"
}
