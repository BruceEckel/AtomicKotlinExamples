// Variance/CovariantReturnTypes.kt
package variance2
import variance.*

open class MakeShape {
  open fun create(): Shape = Shape()
}

open class MakeEllipse : MakeShape() {
  override fun create(): Ellipse = Ellipse()
}

open class MakeCircle : MakeEllipse() {
  override fun create(): Circle = Circle()
}

open class MakeDot : MakeCircle() {
  override fun create(): Dot = Dot()
}

fun main() {
  val s: Shape = MakeShape().create()
  val e: Ellipse = MakeEllipse().create()
  val c: Circle = MakeCircle().create()
  val d: Dot = MakeDot().create()
}
