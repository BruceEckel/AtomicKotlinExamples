// CreatingClasses/Task1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package creatingClassesExercise1

class SomeClass {
  fun a() {
    println("42")
  }

  fun b() {
    a()
  }

  fun c() {
    this.b()
  }
}
