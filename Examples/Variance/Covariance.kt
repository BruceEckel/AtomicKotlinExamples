// Variance/Covariance.kt
package variance

interface Create {
  fun create(): Shape
}

interface CreateEllipse : Create {
  override fun create(): Ellipse
}

interface CreateCircle : CreateEllipse {
  override fun create(): Circle
}

interface CreateDot : CreateEllipse {
  override fun create(): Dot
}

interface CreateDot2 : CreateCircle {
  override fun create(): Dot
}

// Fails because Ellipse is not a subtype
// of Circle:
// interface CreateDot3 : CreateCircle {
//   override fun create(): Ellipse
// }

fun main() {}
