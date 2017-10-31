val Phi = (1 + Math.sqrt(5.0))/2

// Recursive continued-fraction calculation:
fun phiCF(depth: Int): Double {
  if(depth == 0) return 2.0
  return 1 + 1 / phiCF(depth - 1)
}

typealias Algorithm (Int) -> Double

fun compare(f: Algorithm, depth: Int = 1): String {
  if(f(depth) == Phi)
    return "equality at depth = $depth"
  else
    return compare(f, depth + 1)
}

fun main(args: Array<String>) {
  println(compare(::phiCF))
}
