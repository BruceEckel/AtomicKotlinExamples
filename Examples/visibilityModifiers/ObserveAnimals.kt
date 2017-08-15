// visibilityModifiers/ObserveAnimals.kt
fun main(args: Array<String>) {
  // Can't access private members declared in another file:
  // val rabbit = Animal("Rabbit") // Class is private
  // recordAnimal(rabbit) // Function is private
  // counter++  // Property is private

  recordAnimals()
  recordAnimalsCount()
}
/* Output:
Animal #0: Tiger
Animal #1: Antelope
2 animals are here!
*/
