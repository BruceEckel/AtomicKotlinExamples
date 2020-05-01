import java.math.BigInteger

val zero = BigInteger.ZERO
val one = BigInteger.ONE
val two = 2.bigint

fun validate(n:BigInteger):Unit {
  if (n < zero) { throw IllegalArgumentException() }
}

fun iterative(n:BigInteger):BigInteger {
  validate(n)
  var result = zero;
  var  next = one;
  for (i in one rangeTo n) {
    val temporary = result
    result = next
    next = temporary + next
  }
  return result
}
fun iterative(n:Int):BigInteger = iterative(n.bigint)
fun iterative(n:Long):BigInteger = iterative(n.bigint)

fun naïveRecursive(n:BigInteger):BigInteger {
  validate(n)
  return when (n) {
    zero -> zero
    one -> one
    else -> naïveRecursive(n - one) + naïveRecursive(n - two)
  }
}
fun naïveRecursive(n:Int):BigInteger = naïveRecursive(n.bigint)
fun naïveRecursive(n:Long):BigInteger = naïveRecursive(n.bigint)

fun tailRecursive(n:BigInteger):BigInteger {
  validate(n)
  tailrec fun iterate(i:BigInteger, current:BigInteger=zero, next:BigInteger=one):BigInteger {
    return if (i == zero) current else iterate(i - one, next, current + next)
  }
  return iterate(n)
}
fun tailRecursive(n:Int):BigInteger = tailRecursive(n.bigint)
fun tailRecursive(n:Long):BigInteger = tailRecursive(n.bigint)

fun sequence(n:Int):BigInteger {
  validate(n.bigint)
  fun fs(): Sequence<Pair<BigInteger, BigInteger>> {
    return generateSequence(Pair(zero, one), {e -> Pair(e.second, e.first + e.second)})
  }
  return fs().take(n+1).last().first
}

fun foldive(n:BigInteger):BigInteger {
  validate(n)
  return (one rangeTo n).fold(Pair(zero, one), {t, _ -> Pair(t.second, t.first + t.second)}).first
}
fun foldive(n:Int):BigInteger = foldive(n.bigint)
fun foldive(n:Long):BigInteger = foldive(n.bigint)
