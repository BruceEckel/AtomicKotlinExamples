// Interoperability/JTool.java
package Interoperability;

public class JTool {
  public static JTool get(String s) {
    if(s == null) return null;
    return new JTool();
  }
  public String method() {
    return "Success";
  }
}
