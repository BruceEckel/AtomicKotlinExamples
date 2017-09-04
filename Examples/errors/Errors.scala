// Errors/Errors.scala
package errors

data class Except1(why:String): Exception(why)
data class Except2(n:Int): Exception(n.toString)
data class Except3(msg:String, d:Double): Exception("$msg $d")

object toss {
  fun apply(which:Int) =
    which match {
      case 1 => throw Except1("Reason")
      case 2 => throw Except2(11)
      case 3 =>
        throw Except3("Wanted:", 1.618)
      case _ => "OK"
    }
}
