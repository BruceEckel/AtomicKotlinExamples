// InnerClasses/InnerEx2.kt
package innerclassesex2
import atomictest.eq

class Parcel(
  description: String, label: String
) {
  inner class Contents(val description: String)
  inner class Destination(val label: String)
  private val contents = Contents(description)
  private val destination = Destination(label)
  fun manifest() =
    "${contents.description}: " +
    destination.label
}

fun main() {
  val p = Parcel("Computer", "Tasmania")
  val c = p.Contents("Contents")
  val d = p.Destination("Destination")
  p.manifest() eq "Computer: Tasmania"
}
