// CheckInstructions/GetTrace.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package checkinstructions
import atomictest.*

fun getTrace(fileName: String): List<String> {
  require(fileName.startsWith("file_")) {
    "$fileName must start with 'file_'"
  }
  val file = DataFile(fileName)
  require(file.exists()) {
    "$fileName doesn't exist"
  }
  val lines = file.readLines()
  require(lines.isNotEmpty()) {
    "$fileName is empty"
  }
  return lines
}

fun main() {
  DataFile("file_empty.txt").writeText("")
  DataFile("file_real.txt").writeText(
    "wubba lubba dub dub")
  capture {
    getTrace("wrong_name.txt")
  } eq "IllegalArgumentException: " +
    "wrong_name.txt must start with 'file_'"
  capture {
    getTrace("file_nonexistent.txt")
  } eq "IllegalArgumentException: " +
    "file_nonexistent.txt doesn't exist"
  capture {
    getTrace("file_empty.txt")
  } eq "IllegalArgumentException: " +
    "file_empty.txt is empty"
  getTrace("file_real.txt") eq
    "[wubba lubba dub dub]"
}
