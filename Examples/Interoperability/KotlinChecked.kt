// Interoperability/KotlinChecked.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq
import java.io.File

fun main() {
  File("DataFiles/file_wubba.txt")
    .readLines()[0] eq
    "wubba lubba dub dub"
}
