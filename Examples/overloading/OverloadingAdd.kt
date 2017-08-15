// overloading/OverloadingAdd.kt
import atomicTest.eq

fun addInt(i: Int, j: Int): Int = i + j
fun addDouble(i: Double, j: Double): Double = i + j

fun add(i: Int, j: Int): Int = i + j
fun add(i: Double, j: Double): Double = i + j

fun main(args: Array<String>) {
  addInt(5, 6) eq add(5, 6)
  addDouble(56.23, 44.77) eq
      add(56.23, 44.77)
}
