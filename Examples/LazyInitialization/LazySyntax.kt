// LazyInitialization/LazySyntax.kt
package lazyinitialization
import atomictest.*

val unused: String by lazy {
  trace("Initializing 'unused'")
  "'unused' initialization value"
}

val used: String by lazy {
  trace("Initializing 'used'")
  "'used' initialization value"
}

fun main(args: Array<String>) {
  used eq "'used' initialization value"
  trace eq "Initializing 'used'"
}
