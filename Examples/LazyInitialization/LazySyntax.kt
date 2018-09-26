// LazyInitialization/LazySyntax.kt
package lazyinitialization

val unused: String by lazy {
  println("Initializing 'unused'")
  "'unused' initialization value"
}

val used: String by lazy {
  println("Initializing 'used'")
  "'used' initialization value"
}

fun main() {
  println(used)
}
/* Output:
Initializing 'used'
'used' initialization value
*/
