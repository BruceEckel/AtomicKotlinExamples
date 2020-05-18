// CheckInstructions/CheckInstructionsSoln4.kt
package checkinstructionssoln4
import atomictest.*

class Tank(val capacity: Double) {
  val safetyGap = 0.02 * capacity // 2%
  var level: Double = 0.0
    private set
  val maxLevel = capacity - safetyGap
  fun add(quantity: Double): Double {
    require(quantity > 0.0) {
      "quantity must be > 0, is $quantity"
    }
    var remainder = 0.0
    val total = level + quantity
    if (total >= maxLevel) {
      remainder = total - maxLevel
      level = maxLevel
    } else {
      level += quantity
    }
    check(level >= 0.0) {
      "Incorrect level: $level"
    }
    check(level <= maxLevel) {
      "Safety Gap exceeded: $level"
    }
    check(remainder >= 0.0) {
      "Remainder is negative: $remainder"
    }
    return remainder
  }
  fun drain(quantity: Double) {
    require(quantity > 0.0) {
      "quantity must be > 0, is $quantity"
    }
    require(quantity <= level) {
      "drain exceeds tank amount: $quantity"
    }
    level -= quantity
    check(level >= 0.0) {
      "Incorrect level: $level"
    }
  }
}

fun main() {
  val tank = Tank(100.0)
  tank.add(100.0) eq 2.0
  tank.level eq 98.0
  tank.drain(98.0)
  tank.level eq 0.0
  capture { tank.add(-1.0) } eq
    "IllegalArgumentException: " +
    "quantity must be > 0, is -1.0"
  capture { tank.drain(-7.0) } eq
    "IllegalArgumentException: " +
    "quantity must be > 0, is -7.0"
  capture { tank.drain(1.0) } eq
    "IllegalArgumentException: " +
    "drain exceeds tank amount: 1.0"
}
