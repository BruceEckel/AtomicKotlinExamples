// interoperability/JavaChecked.java
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package interoperability;
import java.io.*;
import java.nio.file.*;
import static atomictest.AtomicTestKt.eq;

public class JavaChecked {
  // Build path to current source file, based
  // on directory where Gradle is invoked:
  static Path thisFile = Paths.get(
    "DataFiles", "file_wubba.txt");
  public static void main(String[] args) {
    BufferedReader source = null;
    try {
      source = new BufferedReader(
        new FileReader(thisFile.toFile()));
    } catch(FileNotFoundException e) {
      // Recover from file-open error
    }
    try {
      String first = source.readLine();
      eq(first, "wubba lubba dub dub");
    } catch(IOException e) {
      // Recover from read() error
    }
    try {
      source.close();
    } catch(IOException e) {
      // Recover from close() error
    }
  }
}
