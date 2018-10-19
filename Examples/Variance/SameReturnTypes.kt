// Variance/SameReturnTypes.kt
package variance1
import variance.*

open class MakeShape {
  open fun create(): Shape = Shape()
}

open class MakeEllipse : MakeShape() {
  override fun create(): Shape = Ellipse()
}

open class MakeCircle : MakeEllipse() {
  override fun create(): Shape = Circle()
}

open class MakeDot : MakeCircle() {
  override fun create(): Shape = Dot()
}

fun main() {
  val shapeMakers = listOf(
    MakeShape(),
    MakeEllipse(),
    MakeCircle(),
    MakeDot()
  )
  shapeMakers
    .map(MakeShape::create)
    .forEach {
      println(it::class.simpleName)
    }
  // Type mismatch: inferred type is
  // Shape but Dot was expected:
  // val dot: Dot = MakeDot().create()
}
