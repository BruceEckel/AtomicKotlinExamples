// FromJava/UsingDataClass.java
import java.util.HashMap;
import fromjava.*;

public class UsingDataClass {
  public static void main(String[] args) {
    Data d = new Data("Alice", 22);
    String name = d.getName();
    d.setName("Bob");
    int age = d.getAge();
    d.setAge(age + 1);
    System.out.println(d); // toString()
    HashMap<Data, Integer> hm =
      new HashMap<>();
    hm.put(d, 47);
    // Data objects work as hash keys:
    System.out.println(hm.get(d));
    // copy() function from the data class:
    Data d2 = d.copy("Sam", 24);
    System.out.println(d2);
  }
}
