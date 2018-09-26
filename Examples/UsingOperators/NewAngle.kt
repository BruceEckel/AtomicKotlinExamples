// UsingOperators/NewAngle.kt
import atomictest.eq

fun main() {
  val list = mutableListOf('a', 'b', 'c')
  list[1] eq 'b' // operator get()
  list.get(1) eq 'b' // Explicit call
  list[2] = 'x' // operator set()
  list.set(2, 'x') // Explicit call
  list[2] eq 'x'
  ('a' in list) eq true // operator contains()
  list.contains('a') eq true // Explicit call
}
