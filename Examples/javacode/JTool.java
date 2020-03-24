// javacode/JTool.java
package javacode;

public class JTool {
  public static JTool get(String s) {
    if(s == null) return null;
    return new JTool();
  }
  public String method() {
    return "Success";
  }
}
