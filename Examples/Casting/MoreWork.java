// Casting/MoreWork.java
package casting;

public class MoreWork {
  static String jDogBark(Object a) {
    if(a instanceof JDog)
      return ((JDog)a).bark();        // [1]
    else
      return "not JDog";
  }
  public static void main(String[] args) {
    System.out.println(jDogBark(new JDog()));
    System.out.println(jDogBark(42));
  }
}
