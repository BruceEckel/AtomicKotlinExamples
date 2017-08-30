// interfaces/NoMultipleInheritance.kt
package interfaces1

open class Animal
open class Mammal : Animal()
open class AquaticAnimal : Animal()

// Doesn't compile:
// class Dolphin: Mammal(), AquaticAnimal()
