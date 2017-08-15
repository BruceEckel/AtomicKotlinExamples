// exceptions/DivZero.scala
import com.atomickotlin.AtomicTest._

class Problem(val msg:String)
  extends Exception

def f(i:Int) =
  if(i == 0)
    throw new Problem("Divide by zero")
  else
    24/i

def test(n:Int) =
  try {
    f(n)
  } catch {
    case err:Problem =>
      s"Failed: ${err.msg}"
  }

test(4) is 6
test(5) is 4 // Integer truncation
test(6) is 4
test(0) is "Failed: Divide by zero"
test(24) is 1
test(25) is 0 // Also truncation
