// SecondaryConstructors/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package secondaryConstructorsExercise2

import atomictest.eq

data class SpaceShip(val name: String) {
    constructor(shipClass: String, model: Int)
      : this("$shipClass-$model")
}

fun main() {
    SpaceShip("SuperHighSpeedShip") eq
      "SpaceShip(name=SuperHighSpeedShip)"
    SpaceShip("MClass", 29321) eq
      "SpaceShip(name=MClass-29321)"
}
