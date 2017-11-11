// Exceptions/CatchChecked.java
package exceptions;
import java.io.*;
import checked.*;

public class CatchChecked {
  public static void main(String[] args) {
    try {
      AnnotateThrowsKt.hasCheckedException();
    } catch(IOException e) {
      System.out.println("IOException");
    }
  }
}
