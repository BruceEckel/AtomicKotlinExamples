// SmartCasts/MoreWork.java

class Dog {
  public String bark() { return "yip!"; }
}

public class MoreWork {
  static String barkIfDog(Object a) {
    if(a instanceof Dog)
      return ((Dog)a).bark();        // [1]
    else
      return "not Dog";
  }
  public static void main(String[] args) {
    System.out.println(barkIfDog(new Dog()));
    System.out.println(barkIfDog(42));
  }
}
