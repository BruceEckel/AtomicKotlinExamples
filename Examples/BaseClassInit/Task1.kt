// BaseClassInit/Task1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package baseClassInitializationExercise1

open class A(open val s: String)
open class B(override val s: String): A(s)
class C(override val s: String): B(s)
