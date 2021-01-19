// Abstract/NoMultipleInheritance.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package multipleinheritance1

open class Animal
open class Mammal : Animal()
open class AquaticAnimal : Animal()

// More than one base class doesn't compile:
// class Dolphin : Mammal(), AquaticAnimal()
