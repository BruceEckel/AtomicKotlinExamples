// ReachingJava/LinearRegression.scala
import com.atomickotlin.AtomicTest._
import org.apache.commons.math3._
import stat.regression.SimpleRegression

val r = new SimpleRegression
r.addData(1, 1)
r.addData(2, 1.1)
r.addData(3, 0.9)
r.addData(4, 1.2)

r.getN is 4
r.predict(6) is 1.19
