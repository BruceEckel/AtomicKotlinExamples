// Variance/GameItem.kt
package variance

interface GameItem {
  fun id(): String
}

interface Mineral: GameItem {
  fun form()
}

interface Animal: GameItem {
  fun move()
}

interface Vegetable: GameItem {
  fun edible()
}

interface Insect: GameItem {
  fun crawl()
  fun bite()
  fun fly()
}

// error: variance annotations are only allowed for type parameters of classes and interfaces
// fun <in GameItem> f(item: GameItem) = item.id()

fun main() {}
