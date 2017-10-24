// LazyInitialization/LazySyntax.kt
package LazyInitialization
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
  trace.result eq "Initializing 'used'"
}
