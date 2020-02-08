// DownCasting/MutableSmartCast.kt
package downcasting

class SmartCast1(val c: Creature) {
  fun contact() {
    when (c) {
      is Human -> c.greeting()
      is Dog -> c.bark()
      is Alien -> c.mobility()
    }
  }
}

class SmartCast2(var c: Creature) {
  fun contact() {
    when (val c = c) {             // [1]
      is Human -> c.greeting()     // [2]
      is Dog -> c.bark()
      is Alien -> c.mobility()
    }
  }
}
