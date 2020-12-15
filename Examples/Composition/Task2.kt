// Composition/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package compositionExercise2
import atomictest.*

class Stack<E> {
  private val list = mutableListOf<E>()
  fun push(e: E) = list.add(e)
  fun pop(): E = list.removeLast()
}

class Queue<E> {
  private val list = mutableListOf<E>()
  fun put(e: E) = list.add(e)
  fun poll(): E = list.removeFirst()
}

fun main() {
  val stack = Stack<Int>()
  stack.push(1)
  stack.push(2)
  stack.push(3)
  stack.push(4)
  stack.pop() eq 4
  stack.pop() eq 3

  val queue = Queue<String>()
  queue.put("a")
  queue.put("b")
  queue.put("c")
  queue.put("d")
  queue.poll() eq "a"
  queue.poll() eq "b"
}
