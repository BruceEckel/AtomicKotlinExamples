// Hashing/UnpredictableHashing.kt
import atomictest.eq

fun main() {
  "Hash order is unpredictable".toHashSet() eq
    "[H,  , a, b, c, d, e, h, i, " +
    "l, n, o, p, r, s, t, u]"
}
