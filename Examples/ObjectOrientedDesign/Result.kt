// ObjectOrientedDesign/Result.kt
// Report success or failure
package oodesign

sealed class Result(
  val success: Boolean,
  val room: Room
) {
  class Success(room: Room):
    Result(true, room)
  object Fail: Result(false, Room())
}
