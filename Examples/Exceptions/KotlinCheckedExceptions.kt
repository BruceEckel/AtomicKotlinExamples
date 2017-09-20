// Exceptions/KotlinCheckedExceptions.kt
import java.io.*;

fun noChecked() {
  // FileNotFoundException:
  val source = FileInputStream(
    File("KotlinCheckedExceptions.kt"))
  // IOException:
  println(source.read())
  // IOException:
  source.close();
}
