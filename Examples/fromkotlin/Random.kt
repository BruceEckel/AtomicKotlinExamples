// fromkotlin/Random.kt
import atomictest.eq
import java.util.Random

fun main() {
  val rand = Random(47)
  rand.nextInt(100) eq 58
}
