// Interoperability/MakeSalad.java
package Interoperability;
import interop.Utils;
import static atomictest.AtomicTestKt.eq;

public class MakeSalad {
  public static void main(String[] args) {
    eq(Utils.salad(), "Lettuce!");
  }
}
