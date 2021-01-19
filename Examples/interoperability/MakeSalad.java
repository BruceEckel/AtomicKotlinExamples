// interoperability/MakeSalad.java
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package interoperability;
import interop.Utils;
import static atomictest.AtomicTestKt.eq;

public class MakeSalad {
  public static void main(String[] args) {
    eq(Utils.salad(), "Lettuce!");
  }
}
