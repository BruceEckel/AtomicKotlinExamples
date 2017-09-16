// Hashing/KeyFailure.kt
import atomictest.eq

data class Key(var id: String)

fun main(args: Array<String>) {
  val key = Key("A")
  val hm = hashMapOf(key to "Hello")
  hm eq "{Key(id=A)=Hello}"
  hm[key] eq "Hello"             // [1]

  key.id = "Goodbye"
  hm eq "{Key(id=Goodbye)=Hello}"
  hm[key] eq null                // [2]
}
