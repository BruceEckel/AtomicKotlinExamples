// Exceptions/IntroducingNull.kt

import atomictest.eq

fun main(args: Array<String>) {
  "1$".toIntOrNull() eq null
}
