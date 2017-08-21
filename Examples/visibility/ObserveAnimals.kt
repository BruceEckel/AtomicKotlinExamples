// visibility/ObserveAnimals.kt
import atomicTest.eq

fun main(args: Array<String>) {
  // Can't access private members
  // declared in another file.
  // Class is private:
  // val rabbit = Animal("Rabbit")
  // Function is private:
  // recordAnimal(rabbit)
  // Property is private:
  // counter++

  recordAnimals() eq """
Animal #0: Tiger
Animal #1: Antelope"""
  recordAnimalsCount() eq
    "2 animals are here!"
}
