// interfaces/NoMultipleInheritance.kt
package classes

open class Animal
open class Mammal : Animal()
open class AquaticAnimal : Animal()

// Doesn't compile:
// class Dolphin : Mammal(), AquaticAnimal()
