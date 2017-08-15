// memberFunctions/Hamster.kt

class Hamster {
  fun speak() = "squeak! "
  fun exercise() =
    this.speak() + // Qualified with 'this'
    speak() +      // Without 'this'
    "Running on wheel"
}

fun main(args: Array<String>) {
  val hamster = Hamster()
  println(hamster.exercise())
}
/* Output:
squeak! squeak! Running on wheel
*/
