// Composition/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package compositionExercise3
import atomictest.*

class Stack<E> {
  private val list = mutableListOf<E>()

  fun push(e: E) {
    list += e
  }

  fun pop(): E = list.removeAt(list.lastIndex)
}

@OptIn(ExperimentalStdlibApi::class)
class Queue<E> {
  private val arrayDeque = ArrayDeque<E>()

  fun add(e: E) {
    arrayDeque.addLast(e)
  }

  fun poll(): E = arrayDeque.removeFirst()
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
  queue.add("a")
  queue.add("b")
  queue.add("c")
  queue.add("d")
  queue.poll() eq "a"
  queue.poll() eq "b"
}
