// ExtensionLambdas/LambdaUnitReturn.kt
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
  unitReturn { } // ... or nothing
  nonUnitReturn {
    "Must return the proper type"
  }
  // nonUnitReturn { } // Not an option
}
