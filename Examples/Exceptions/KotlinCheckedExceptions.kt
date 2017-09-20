// Exceptions/KotlinCheckedExceptions.kt
import java.io.*;

fun main(args: Array<String>) {
  // FileNotFoundException:
  val source = FileInputStream(
    File("KotlinCheckedExceptions.kt"))
  // IOException:
  println(source.read())
  // IOException:
  source.close();
}
