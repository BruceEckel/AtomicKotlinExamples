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

interface Humanoid: Animal
interface Elf: Humanoid
interface Human: Humanoid
interface Dwarf: Humanoid

interface Creature: Animal
interface Goblin: Creature
interface Imp: Creature
interface Brownie: Creature
interface Troll: Creature
interface Pixie: Creature
interface Bogie: Creature

interface Pukwudgie : Goblin

// error: variance annotations are only allowed for type parameters of classes and interfaces
// fun <in GI> f(item: GI) = item.id()

// GameItem is the upper bound:
fun <GI: GameItem> g(item: GI) = item.id()

// Or just use polymorphism:
fun h(item: GameItem) = item.id()

fun main() {}
