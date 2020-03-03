// ObjectOrientedDesign/Result.kt
package robotexplorer

// Report success or failure:
sealed class Result(
  val success: Boolean,
  val room: Room
) {
  class Success(room: Room) :
    Result(true, room)
  object Fail : Result(false, Room())
}
