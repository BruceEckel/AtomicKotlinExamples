// Hashing/SimpleHashing.kt
import atomictest.eq

fun main() {
  val keys = 'A'..'z'
  val hm = HashMap(
    keys.associate { it to keys.indexOf(it) })
  hm['Z'] eq 25
  hm['x'] = 42
  hm['x'] eq 42

  val items = 'A'..'F'
  val hs = HashSet(
    items + items + items + items + items
  )
  hs eq "[A, B, C, D, E, F]"
  ('C' in hs) eq true
  ('c' in hs) eq false
  hs.containsAll(('B'..'D').toSet()) eq true
  hs.intersect(('D'..'Z').toSet()) eq
    "[D, E, F]"
}
