// Abstract/MultipleInterfaceInheritance.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package multipleinheritance2

interface Animal
interface Mammal: Animal
interface AquaticAnimal: Animal

class Dolphin : Mammal, AquaticAnimal
