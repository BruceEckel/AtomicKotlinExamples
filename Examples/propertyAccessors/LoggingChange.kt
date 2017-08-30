// propertyAccessors/LoggingChange.kt
import atomicTest.eq

class LoggingChange {
  var trace = ""
  var property: Int = 0
    set(value) {
      trace += "$field becomes $value"
      field = value
    }
}

fun main(args: Array<String>) {
  val lc = LoggingChange()
  lc.property = 2
  lc.trace eq "0 becomes 2"
}
