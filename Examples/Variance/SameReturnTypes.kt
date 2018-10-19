// Variance/SameReturnTypes.kt
package variance1
import variance.*

open class CreateShape {
  open fun create(): Shape = Shape()
}

open class CreateEllipse : CreateShape() {
  override fun create(): Shape = Ellipse()
}

open class CreateCircle : CreateEllipse() {
  override fun create(): Shape = Circle()
}

open class CreateDot : CreateCircle() {
  override fun create(): Shape = Dot()
}

fun main() {
  listOf(
    CreateShape(),
    CreateEllipse(),
    CreateCircle(),
    CreateDot())
      .map(CreateShape::create)
      .forEach {
        println(it::class.simpleName)
      }
  // Type mismatch: inferred type is
  // Shape but Dot was expected:
  // val dot: Dot = CreateDot().create()
}
/* Output:
Shape
Ellipse
Circle
Dot
*/
