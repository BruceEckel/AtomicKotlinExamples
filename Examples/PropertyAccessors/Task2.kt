// PropertyAccessors/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package propertyAccessorsExercise2
import atomictest.eq

class Accessible {

  var mutable: String = ""
    get() {
      println("mutable:get")
      return field
    }
    set(value) {
      println("mutable:set")
      field = value
    }

  val readOnly: String
    get() {
      println("readOnly:get")
      return mutable
    }
}

fun main() {
/*
  val accessible = Accessible()
  accessible.mutable = "abc"
  accessible.readOnly eq "abc"
*/
}
/* Expected output:
mutable:set
readOnly:get
mutable:get
abc
 */
