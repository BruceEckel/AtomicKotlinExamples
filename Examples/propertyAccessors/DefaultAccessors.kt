// propertyAccessors/DefaultAccessors.kt
import atomicTest.eq

class DefaultAccessors {
  var property: Int = 0
    get() = field                    // [1]
    set(value) {
      field = value                  // [2]
    }
}

fun main(args: Array<String>) {
  val defaultAccessors = DefaultAccessors()
  defaultAccessors.property = 2      // [3]
  defaultAccessors.property eq 2     // [4]
}
