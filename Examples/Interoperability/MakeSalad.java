// Interoperability/MakeSalad.java
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package Interoperability;
import interop.Utils;
import static atomictest.AtomicTestKt.eq;

public class MakeSalad {
  public static void main(String[] args) {
    eq(Utils.salad(), "Lettuce!");
  }
}
