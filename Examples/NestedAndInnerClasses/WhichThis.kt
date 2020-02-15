// NestedAndInnerClasses/WhichThis.kt
package innernested

fun which(thiz: Any) = thiz::class.simpleName
