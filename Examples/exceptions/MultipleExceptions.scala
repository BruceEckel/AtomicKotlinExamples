// exceptions/MultipleExceptions.scala
import atomicTest.eq
import errors.*

fun test(which:Int) =
  try {
    toss(which)
  } catch {
    case Except1(why) => "Except1 $why"
    case Except2(n) => "Except2 $n"
    case Except3(msg, d) =>
      "Except3 $msg $d"
  }

test(0) is "OK"
test(1) is "Except1 Reason"
test(2) is "Except2 11"
test(3) is "Except3 Wanted: 1.618"
