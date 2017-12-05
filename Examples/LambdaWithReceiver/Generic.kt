// LambdaWithReceiver/Generic.kt
package lambdawithreceiver

fun <T> gUseF(k:T, lwr:T.() -> Unit) = k.lwr()

fun main(args: Array<String>) {
  gUseF(Klass1()) { f() }
}
