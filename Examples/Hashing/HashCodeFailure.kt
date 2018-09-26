// Hashing/HashCodeFailure.kt
import atomictest.*

class NotDataClass(id: String)
data class DataClass(val id: String)

fun main() {
  val key = NotDataClass("A")
  val key2 = NotDataClass("A")
  key.hashCode() neq key2.hashCode()    // [1]
  key.equals(key2) eq false             // [2]
  val hm = hashMapOf(key to "Hello")
  hm[key] eq "Hello"
  hm[key2] eq null                      // [3]

  val dckey = DataClass("A")
  val dckey2 = DataClass("A")
  dckey.hashCode() eq dckey2.hashCode() // [4]
  dckey.equals(dckey2) eq true          // [5]
  val hmdc = hashMapOf(dckey to "Hello")
  hmdc[dckey] eq "Hello"
  hmdc[dckey2] eq "Hello"               // [6]
}
