// DesigningWithInheritance/ListInterfaces.kt
package designingwithinheritance.lists

interface List<E> {
  // Read-only access operations
  val size: Int
  fun get(index: Int): E
  fun isEmpty(): Boolean
  fun contains(element: E): Boolean
  // ...
}

interface MutableList<E> : List<E> {
  // Modification Operations
  fun add(element: E): Boolean
  fun remove(element: E): Boolean
  // ...
}
