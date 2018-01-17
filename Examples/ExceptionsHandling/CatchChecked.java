// ExceptionsHandling/CatchChecked.java
package ExceptionsHandling;
import java.io.*;
import checked.*;
import static atomictest.AtomicTestKt.eq;

public class CatchChecked {
  public static void main(String[] args) {
    try {
      AnnotateThrowsKt.hasCheckedException();
    } catch(IOException e) {
      eq(e, "java.io.IOException");
    }
  }
}
