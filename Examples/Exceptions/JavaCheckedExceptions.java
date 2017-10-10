// Exceptions/JavaCheckedExceptions.java
package Exceptions;

import java.io.*;

public class JavaCheckedExceptions {
  public static void main(String[] args) {
    InputStream source = null;
    try {
      source = new FileInputStream(new File(
        "JavaCheckedExceptions.java"));
    } catch(FileNotFoundException e) {
      // Recover from file-open error
    }
    try {
      int contents = source.read();
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
