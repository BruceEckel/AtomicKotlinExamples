// Generics/GenericSpeakers.kt
package generics
import atomictest.*

fun <T> talkg(spkr: T, spk: T.() -> String) =
  spkr.spk()

fun main(arg: Array<String>) {
  talkg(Person()) { speak() } eq "Hi!"
  talkg(Dog()) { bark() } eq "Ruff!"
  talkg(Robot()) { connect() } eq "Beep!"
}
