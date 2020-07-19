// Reification/College.kt
package reification

class College {
  fun course() {}
  fun thesis() {}
}

class ClownCollege {
  fun pieThrowing() {}
  fun tinyTricycleRiding() {}
  fun thesis() {}
}

fun <T> T.graduate(f: T.() -> Unit) = f()

fun main() {
  val c = College()
  val cc = ClownCollege()
  c.graduate(College::thesis)
  cc.graduate(ClownCollege::thesis)
  c.graduate(College::course)
  cc.graduate(ClownCollege::pieThrowing)
  cc.graduate(ClownCollege::tinyTricycleRiding)
}
