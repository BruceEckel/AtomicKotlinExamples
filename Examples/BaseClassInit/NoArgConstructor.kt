// BaseClassInit/NoArgConstructor.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package baseclassinit

open class SuperClass1(val i: Int)
class SubClass1(i: Int) : SuperClass1(i)

open class SuperClass2
class SubClass2 : SuperClass2()
