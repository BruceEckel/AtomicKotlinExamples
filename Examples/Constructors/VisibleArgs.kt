// Constructors/VisibleArgs.kt

class AlienWithMutableName(var name: String)
class AlienWithFixedName(val name: String)

fun main(args: Array<String>) {
  val alien1 =
    AlienWithMutableName("Reverse Giraffe")
  val alien2 =
    AlienWithFixedName("Krombopolis Michael")

  alien1.name = "Parasite"
  // Can't do this:
  // alien2.name = "Parasite"
}
