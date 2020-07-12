// ExtensionLambdas/Sandwich.kt
package extensionlambdas

open class Bread {
  fun toast(): Toast = Toast()
  fun grill(): Grilled = Grilled()
  fun peanutButter() = Unit
  fun grapeJelly() = Unit
  fun ham() = Unit
  fun swiss() = Unit
  fun mustard() = Unit
}

class Toast: Bread()
class Grilled: Bread()

fun sandwich(
  addFillings: Bread.() -> Unit
): Bread {
  val bread = Bread()
  val toast = bread.toast()
  toast.addFillings()
  return toast
}

fun main() {
  val pbj = sandwich {
    peanutButter()
    grapeJelly()
  }
  val hamAndSwiss = sandwich {
    ham()
    swiss()
    mustard()
    grill()
  }
}
