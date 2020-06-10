// TypeChecking/TypeCheckingSoln3.kt
package typecheckingsoln3
import atomictest.eq
import typechecking.name

sealed class Insect {
  open fun walk() = "${this.name}: walk"
  open fun fly() = "${this.name}: fly"
}

class HouseFly: Insect()

class Flea: Insect() {
  override fun fly() =
    throw Exception("Flea cannot fly")
  fun crawl() = "Flea: crawl"
}

fun Insect.basic() =
  this.walk() + " " +
    when(this) {
      is Flea -> this.crawl()
      else -> this.fly()
    }

interface SwimmingInsect {
  fun swim() = "${this.name}: swim"
}

interface WaterWalker {
  fun walkWater() =
    "${this.name}: walk on water"
}

class WaterBeetle : Insect(), SwimmingInsect
class WaterStrider: Insect(), WaterWalker
class WhirligigBeetle: Insect(),
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
