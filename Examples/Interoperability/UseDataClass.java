// interoperability/UseDataClass.java
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package interoperability;
import java.util.HashMap;
import static atomictest.AtomicTestKt.eq;

public class UseDataClass {
  public static void main(String[] args) {
    Staff e = new Staff(
      "Fluffy", "Office Manager");
    eq(e.getRole(), "Office Manager");
    e.setName("Uranus");
    e.setRole("Assistant");
    eq(e,
      "Staff(name=Uranus, role=Assistant)");

    // Call copy() from the data class:
    Staff cf = e.copy("Cornfed", "Sidekick");
    eq(cf,
      "Staff(name=Cornfed, role=Sidekick)");

    HashMap<Staff, String> hm =
      new HashMap<>();
    // Employees work as hash keys:
    hm.put(e, "Cheerful");
    eq(hm.get(e), "Cheerful");
  }
}
