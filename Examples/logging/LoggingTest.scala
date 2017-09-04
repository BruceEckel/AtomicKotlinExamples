// Logging/LoggingTest.scala
package logging
import com.atomickotlin.Logging

class LoggingTest extends Logging {
  info("Constructing a LoggingTest")
  def f = {
    trace("entering f")
    // ...
    trace("leaving f")
  }
  def g(i:Int) = {
    debug(s"inside g with i: $i")
    if(i < 0)
      error("i less than 0")
    if(i > 100)
      warn(s"i getting high: $i")
  }
}

val lt = new LoggingTest
lt.f
lt.g(0)
lt.g(-1)
lt.g(101)
