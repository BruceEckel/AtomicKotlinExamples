// MoreGenerics/Speakers.kt
package moregenerics
import atomictest.eq

class Person {
  fun speak() = "Hi!"
  fun sit() = true
}

class Dog {
  fun bark() = "Ruff!"
  fun lieDown() = true
}

class Robot {
  fun connect() = "Beep!"
  fun charge() = true
}

fun talk(speaker: Any) = when (speaker) {
  is Person -> speaker.speak()
  is Dog -> speaker.bark()
  is Robot -> speaker.connect()
  else -> "Not a talker" // Or exception
}

fun main() {
  talk(Person()) eq "Hi!"
  talk(Dog()) eq "Ruff!"
  talk(Robot()) eq "Beep!"
  talk(11) eq "Not a talker"
}
