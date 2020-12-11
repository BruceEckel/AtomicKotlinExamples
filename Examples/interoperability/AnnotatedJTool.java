// interoperability/AnnotatedJTool.java
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package interoperability;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AnnotatedJTool {
  @Nullable
  public static JTool
  getUnsafe(@Nullable String s) {
    if(s == null) return null;
    return getSafe(s);
  }
  @NotNull
  public static JTool
  getSafe(@NotNull String s) {
    return new JTool();
  }
  public String method() {
    return "Success";
  }
}
