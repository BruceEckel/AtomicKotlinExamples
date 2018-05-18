// Abstract/MultipleInterfaceInheritance.kt
package multipleinheritance2

interface Animal
interface Mammal : Animal
interface AquaticAnimal : Animal

// Now it compiles!
class Dolphin : Mammal, AquaticAnimal
