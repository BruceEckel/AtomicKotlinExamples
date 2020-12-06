// Composition/Task2StarterCode.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package compositionExercise2StarterCode
import atomictest.*

class Stack<E> : ArrayList<E>() {
  fun push(e: E) = add(e)
  fun pop(): E = removeAt(lastIndex)
}

class Queue<E>: ArrayList<E>() {
  fun put(e: E) = add(e)
  fun poll(): E = removeAt(0)
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
