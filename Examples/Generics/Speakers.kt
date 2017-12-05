// Generics/Speakers.kt
package generics
import atomictest.*

class Person { fun speak() = "Hi!" }
class Dog { fun bark() = "Ruff!" }
class Robot { fun connect() = "Beep!" }

fun talk(speaker: Any) = when(speaker) {
  is Person -> speaker.speak()
  is Dog -> speaker.bark()
  is Robot -> speaker.connect()
  else -> "Not a speaker" // Or exception
}

fun main(arg: Array<String>) {
  talk(Person()) eq "Hi!"
  talk(Dog()) eq "Ruff!"
  talk(Robot()) eq "Beep!"
  talk(11) eq "Not a speaker"
}
