// callingFromJava/Eratosthenes.scala
package primesieve

object Eratosthenes {
  def ints(n:Int):Stream[Int] =
    Stream.cons(n, ints(n+1))
  def primes(nums:Stream[Int]):Stream[Int]=
    Stream.cons(nums.head, primes(
      nums.tail.filter(
        n => n % nums.head != 0)))
  def sieve(n:Int) =
    primes(ints(2)).take(n).toList
}
