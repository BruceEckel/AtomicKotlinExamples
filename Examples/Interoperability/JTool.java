// interoperability/JTool.java
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package interoperability;

public class JTool {
  public static JTool get(String s) {
    if(s == null) return null;
    return new JTool();
  }
  public String method() {
    return "Success";
  }
}
