// ExtensionLambdas/LambdaUnitReturn.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package extensionlambdas

fun unitReturn(lambda: A.() -> Unit) =
  A().lambda()

fun nonUnitReturn(lambda: A.() -> String) =
  A().lambda()

fun lambdaUnitReturn () {
  unitReturn {
    "Unit ignores the return value" +
    "So it can be anything ..."
  }
  unitReturn { 1 } // ... of any type ...
  unitReturn { }   // ... or nothing
  nonUnitReturn {
    "Must return the proper type"
  }
  // nonUnitReturn { } // Not an option
}
