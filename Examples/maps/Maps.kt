// maps/Maps.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val constants = mapOf("Pi" to 3.141,
      "e" to 2.718, "phi" to 1.618)

  constants eq "{Pi=3.141, e=2.718, phi=1.618}"

  // Look up a value from a key:
  constants["e"] eq 2.718

  constants.keys eq setOf("Pi", "e", "phi")

  constants.values eq "[3.141, 2.718, 1.618]"

  var s = ""
  // Iterate through key-value pairs:
  for (entry in constants) {
    s += "${entry.key}=${entry.value}, "
  }
  s eq "Pi=3.141, e=2.718, phi=1.618, "

  s = ""
  // Unpack during iteration:
  for ((key, value) in constants) {
    s += "$key=$value, "
  }
  s eq "Pi=3.141, e=2.718, phi=1.618, "
}
