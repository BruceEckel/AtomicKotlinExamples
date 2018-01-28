// SmartCasts/MoreWork.java
package smartcasts;

public class MoreWork {
  static String barkIfJDog(Object a) {
    if(a instanceof JDog)
      return ((JDog)a).bark();        // [1]
    else
      return "not JDog";
  }
  public static void main(String[] args) {
    System.out.println(barkIfJDog(new Dog()));
    System.out.println(barkIfJDog(42));
  }
}
