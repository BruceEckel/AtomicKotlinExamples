class Yard<T>(private var resident: T){
  fun add(item: T) { resident = item }
  fun get() = resident
}

class Chicken

fun main() {
  val yardWithChicken = Yard(Chicken())
}