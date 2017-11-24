// Constructors/Coffee.kt
import atomictest.*

class Coffee(
  val shots: Int = 2,
  val decaf: Boolean = false,
  val milk: Boolean = false,
  val toGo: Boolean = false,
  val syrup: String = "") {
  var result = ""
  init {
    trace(listOf(
      shots, decaf, milk, toGo, syrup))
    getCup()
    pourShots()
    addMilk()
    addSyrup()
  }
  fun getCup() {
    result +=
      if(toGo) "ToGoCup " else "HereCup "
  }
  fun pourShots() {
    for (s in 1..shots)
      result +=
        if(decaf) "decaf shot " else "shot "
  }
  fun addMilk() {
    if (milk) {
      result += "milk "
    }
  }
  fun addSyrup() {
    result += syrup
  }
}

fun main(args: Array<String>) {
  val usual = Coffee()
  usual.result eq "HereCup shot shot "
  val mocha = Coffee(decaf = true,
    toGo = true, syrup = "Chocolate")
  mocha.result eq
    "ToGoCup decaf shot decaf shot Chocolate"
  trace eq """
[2, false, false, false, ]
[2, true, false, true, Chocolate]
"""
}
