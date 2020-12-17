// TypeChecking/TypeCheckingSoln3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package typeCheckingExercise3
import atomictest.eq
import typechecking.name

sealed class Insect {
  open fun walk() = "$name: walk"
  open fun fly() = "$name: fly"
}

class HouseFly : Insect()

class Flea : Insect() {
  override fun fly() =
    throw Exception("Flea cannot fly")
  fun crawl() = "Flea: crawl"
}

fun Insect.basic() =
  walk() + " " +
    when(this) {
      is Flea -> crawl()
      else -> fly()
    }

interface SwimmingInsect {
  fun swim() = "$name: swim"
}

interface WaterWalker {
  fun walkWater() =
    "$name: walk on water"
}

class WaterBeetle : Insect(), SwimmingInsect
class WaterStrider : Insect(), WaterWalker
class WhirligigBeetle : Insect(),
  SwimmingInsect, WaterWalker

fun Insect.water() =
  when(this) {
    is SwimmingInsect -> swim()
    is WaterWalker -> walkWater()
    else -> "$name: drown"
  }

fun main() {
  val insects = listOf(
    HouseFly(), Flea(), WaterStrider(),
    WaterBeetle(), WhirligigBeetle()
  )
  insects.map { it.basic() } eq
    "[HouseFly: walk HouseFly: fly, " +
    "Flea: walk Flea: crawl, " +
    "WaterStrider: walk WaterStrider: fly, " +
    "WaterBeetle: walk WaterBeetle: fly, " +
    "WhirligigBeetle: walk " +
    "WhirligigBeetle: fly]"
  insects.map { it.water() } eq
    "[HouseFly: drown, Flea: drown, " +
    "WaterStrider: walk on water, " +
    "WaterBeetle: swim, " +
    "WhirligigBeetle: swim]"
}
