package CreatingGenerics

class Yard<T> {
  private var resident: T? = null
  fun add(item: T) { resident = item }
  fun get(): T? = resident
}

class Chicken {
  fun layEgg() {}
}

fun main() {
  val chickenYard = Yard<Chicken>()
  chickenYard.add(Chicken())
  val chicken: Chicken? = chickenYard.get()
  chicken?.layEgg()
}