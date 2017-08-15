// errors/Errors.scala
package errors

case class Except1(why:String)
  extends Exception(why)
case class Except2(n:Int)
  extends Exception(n.toString)
case class Except3(msg:String, d:Double)
  extends Exception(s"$msg $d")

object toss {
  def apply(which:Int) =
    which match {
      case 1 => throw Except1("Reason")
      case 2 => throw Except2(11)
      case 3 =>
        throw Except3("Wanted:", 1.618)
      case _ => "OK"
    }
}
