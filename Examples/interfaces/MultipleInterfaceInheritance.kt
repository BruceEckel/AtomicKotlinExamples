// interfaces/MultipleInterfaceInheritance.kt
package interfaces1

interface Animal
interface Mammal : Animal
interface AquaticAnimal : Animal

// Now compiles!
class Dolphin : Mammal, AquaticAnimal
