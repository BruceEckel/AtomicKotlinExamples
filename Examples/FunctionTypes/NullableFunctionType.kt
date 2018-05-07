// FunctionTypes/NullableFunctionType.kt
import atomictest.eq

fun main(args: Array<String>) {
  val returnTypeNullable: (String) -> Int? =
    { null }
  val mightBeNull: ((String) -> Int)? = null
  returnTypeNullable("abc") eq null
  // Won't compile without a null check:
  // mightBeNull("abc")
  if (mightBeNull != null) {
    mightBeNull("abc")
  }
}
