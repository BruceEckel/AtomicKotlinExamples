// Interfaces/MultipleInterfaceInheritance.kt
package interfaces2

interface Animal
interface Mammal: Animal
interface AquaticAnimal: Animal

// Now it compiles!
class Dolphin: Mammal, AquaticAnimal
