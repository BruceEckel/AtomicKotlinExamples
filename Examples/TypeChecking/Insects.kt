// TypeChecking/Insects.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package typechecking
import atomictest.eq

interface Insect {
  fun walk() = "${this.name}: walk"
  fun fly() = "${this.name}: fly"
}

class HouseFly : Insect

class Flea : Insect {
  override fun fly() =
    throw Exception("Flea cannot fly")
  fun crawl() = "Flea: crawl"
}

fun Insect.basic() =
  this.walk() + " " +
  if (this is Flea)
    this.crawl()
  else
    this.fly()

interface SwimmingInsect: Insect {
  fun swim() = "${this.name}: swim"
}

interface WaterWalker: Insect {
  fun walkWater() =
    "${this.name}: walk on water"
}

class WaterBeetle : SwimmingInsect
class WaterStrider : WaterWalker
class WhirligigBeetle :
  SwimmingInsect, WaterWalker

fun Insect.water() =
  when(this) {
    is SwimmingInsect -> this.swim()
    is WaterWalker -> this.walkWater()
    else -> "${this.name}: drown"
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
