// FromKotlin/JavaTool.java
package FromKotlin;

public class JavaTool {
  public static
  JavaTool get(String s) {
    if(s == null) return null;
    return new JavaTool();
  }
  public String method() {
    return "Success";
  }
}
