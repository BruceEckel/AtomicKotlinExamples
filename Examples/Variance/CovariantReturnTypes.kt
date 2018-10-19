// Variance/CovariantReturnTypes.kt
package variance2
import variance.*

open class CreateShape {
  open fun create(): Shape = Shape()
}

open class CreateEllipse : CreateShape() {
  override fun create(): Ellipse = Ellipse()
}

open class CreateCircle : CreateEllipse() {
  override fun create(): Circle = Circle()
}

open class CreateDot : CreateCircle() {
  override fun create(): Dot = Dot()
}

fun main() {
  val s: Shape = CreateShape().create()
  val e: Ellipse = CreateEllipse().create()
  val c: Circle = CreateCircle().create()
  val d: Dot = CreateDot().create()
}
