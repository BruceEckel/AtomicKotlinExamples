// PropertyAccessors/LogChanges.kt
import atomictest.*

class LogChanges {
  var n: Int = 0
    set(value) {
      trace("$field becomes $value")
      field = value
    }
}

fun main(args: Array<String>) {
  val lc = LogChanges()
  lc.n eq 0 // Uses default get()
  lc.n = 2
  trace.result eq "0 becomes 2"
}
