// Testing/Trace2.kt
import atomictest.*

class CitadelOfRicks {
  val rick1 = "Rick C-137"
  val rick2 = "Rick D. Sanchez III"
  val rick3 = "Tiny Rick"
  val rick4 = "Simple Rick"
  override fun toString() =
    "$rick1 \n $rick2 \n $rick3 \n $rick4"
}

fun main() {
  Trace(CitadelOfRicks()) eq """
  Rick C-137
  Rick D. Sanchez III
  Tiny Rick
  Simple Rick
  """
}
