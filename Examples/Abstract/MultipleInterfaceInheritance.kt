// Abstract/MultipleInterfaceInheritance.kt
package multipleinheritance2

interface Animal
interface Mammal: Animal
interface AquaticAnimal: Animal

class Dolphin: Mammal, AquaticAnimal
