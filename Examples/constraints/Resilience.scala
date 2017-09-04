// Constraints/Resilience.scala
import com.atomickotlin.AtomicTest._

trait Resilience

object Bounciness extends Enumeration {
  case class _Val() extends Val
    with Resilience
  type Bounciness = _Val
  val level1, level2, level3 = _Val()
}
import Bounciness._

object Flexibility extends Enumeration {
  case class _Val() extends Val
    with Resilience
  type Flexibility = _Val
  val type1, type2, type3 = _Val()
}
import Flexibility._

trait Spring[R <: Resilience] {
  val res:R
}

case class BouncingBall(res:Bounciness)
  extends Spring[Bounciness]

BouncingBall(level2) is
  "BouncingBall(level2)"

case class FlexingWall(res:Flexibility)
  extends Spring[Flexibility]

FlexingWall(type3) is "FlexingWall(type3)"
