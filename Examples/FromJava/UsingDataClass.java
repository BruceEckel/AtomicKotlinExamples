// fromjava/UsingDataClass.java
package fromjava;
import java.util.HashMap;
import static atomictest.AtomicTestKt.eq;

public class UsingDataClass {
  public static void main(String[] args) {
    Data d = new Data("Alice", 22);
    String name = d.getName();
    d.setName("Bob");
    int age = d.getAge();
    d.setAge(age + 1);
    // toString():
    eq(d, "Data(name=Bob, age=23)");
    HashMap<Data, Integer> hm =
      new HashMap<>();
    hm.put(d, 47);
    // Data objects work as hash keys:
    eq((double)hm.get(d), (double)47);
    // copy() function from the Data class:
    Data d2 = d.copy("Sam", 24);
    eq(d2, "Data(name=Sam, age=24)");
  }
}
