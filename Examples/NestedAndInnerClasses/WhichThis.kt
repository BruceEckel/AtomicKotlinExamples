// NestedAndInnerClasses/WhichThis.kt
package nestedinner

fun which(thiz: Any) = thiz::class.simpleName
