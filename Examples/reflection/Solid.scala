// reflection/Solid.scala
package reflection
import com.atomickotlin.AtomicTest._
import com.atomickotlin.Name

class Solid extends Name
val s = new Solid
s is "Solid"

class Solid2(val size:Int) extends Name {
  override def toString =
    s"${super.toString}($size)"
}

val s2 = new Solid2(47)
s2 is "Solid2(47)"
