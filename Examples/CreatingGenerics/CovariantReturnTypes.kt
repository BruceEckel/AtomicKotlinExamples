// CreatingGenerics/CovariantReturnTypes.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package variance

interface Parent
interface Child : Parent

interface  X {
  fun f(): Parent
}

interface Y : X {
  override fun f(): Child
}
