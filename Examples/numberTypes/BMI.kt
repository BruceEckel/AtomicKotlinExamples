// numberTypes/BMI.kt
fun getBmiStatus(kg: Double, heightM: Double): String {
  val bmi = kg / (heightM * heightM)      // [1]
  return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}

fun main(args: Array<String>) {
  val kg = 72.57 // 160 lbs
  val heightM = 1.727 // 68 inches
  val status = getBmiStatus(kg, heightM)
  println(status)
}
/* Output:
Normal weight
*/
