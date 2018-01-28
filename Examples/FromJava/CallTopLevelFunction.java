// fromjava/CallTopLevelFunction.java
package fromjava;
import mypackage.TopLevelFunctionKt;
import static atomictest.AtomicTestKt.eq;

public class CallTopLevelFunction {
  public static void main(String[] args) {
    eq(TopLevelFunctionKt.hi(), "Hello!");
  }
}
