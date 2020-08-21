// Interoperability/CallTopLevelFunction.java
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package Interoperability;
import interop.TopLevelFunctionKt;
import static atomictest.AtomicTestKt.eq;

public class CallTopLevelFunction {
  public static void main(String[] args) {
    eq(TopLevelFunctionKt.hi(), "Hello!");
  }
}
