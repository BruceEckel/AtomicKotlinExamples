// FromKotlin/Random.kt
import atomictest.eq
import java.util.Random

fun main(args: Array<String>) {
  val rand = Random(47)
  rand.nextInt(100) eq 58
}
