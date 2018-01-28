// Constraints/Constraint.scala
import com.atomickotlin.AtomicTest._

class WithF {
  def f(n:Int) = n * 11
}

class CallF[T <: WithF](t:T) {
  def g(n:Int) = t.f(n)
}

new CallF(new WithF).g(2) is 22

new CallF(new WithF {
  override def f(n:Int) = n * 7
}).g(2) is 14
