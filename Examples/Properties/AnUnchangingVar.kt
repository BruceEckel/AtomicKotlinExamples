// Properties/AnUnchangingVar.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.

class Sofa {
  val cover: String = "Loveseat cover"
}

fun main() {
  var sofa = Sofa()
  // Not allowed:
  // sofa.cover = "New cover"
  // Reassigning a var:
  sofa = Sofa()
}
