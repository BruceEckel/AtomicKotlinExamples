// FunctionTypes/NullableFunctionType.kt
import atomictest.eq

fun main(args: Array<String>) {
  val returnTypeIsNullable: (String) -> Int? =
    { null }
  val mightBeNull: ((String) -> Int)? = null
  returnTypeIsNullable("abc") eq null
  // Won't compile without a null check:
  // mightBeNull("abc")
  if (mightBeNull != null) {
    mightBeNull("abc")
  }
}
