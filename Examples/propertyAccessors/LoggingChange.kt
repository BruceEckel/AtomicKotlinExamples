// propertyAccessors/LoggingChange.kt
class LoggingChange {
  var property: Int = 0
    set(value) {
      println("Value has changed from $field to $value")
      field = value
    }
}

fun main(args: Array<String>) {
  LoggingChange().property = 2
}
/* Output:
Value has changed from 0 to 2
*/
