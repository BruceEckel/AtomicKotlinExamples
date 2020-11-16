// Interoperability/UseDataClass.java
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package Interoperability;
import java.util.HashMap;
import static atomictest.AtomicTestKt.eq;

public class UseDataClass {
  public static void main(String[] args) {
    Muppet m = new Muppet("Ernie", 6);
    int ageErnie = m.getAge();
    m.setName("Bert");
    m.setAge(7);
    eq(ageErnie < m.getAge(), true);
    eq(m, "Muppet(name=Bert, age=7)");

    // Call copy() from the data class:
    Muppet mc = m.copy("???", 5);
    eq(mc, "Muppet(name=???, age=5)");

    HashMap<Muppet, String> hm =
      new HashMap<>();
    // Muppets work as hash keys:
    hm.put(m, "Happy Muppet");
    eq(hm.get(m), "Happy Muppet");
  }
}
