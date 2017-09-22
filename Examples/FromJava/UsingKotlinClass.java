// FromJava/UsingKotlinClass.java
import fromjava.*;

public class UsingKotlinClass {
  public static void main(String[] args) {
    Basic b = new Basic();
    int p1 = b.getProperty1();
    b.setProperty1(12);
    int v = b.value();
  }
}
