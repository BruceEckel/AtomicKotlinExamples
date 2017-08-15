// numberTypes/IntegerMath.kt
fun getBmiStatusInt(lbs: Int, height: Int): String {
  val bmi = lbs / (height * height) * 703.07 // [1]
  return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}

fun main(args: Array<String>) {
  val lbs = 160
  val height = 68
  val status = getBmiStatusInt(lbs, height)
  println(status)
}
/* Output:
Underweight
*/
