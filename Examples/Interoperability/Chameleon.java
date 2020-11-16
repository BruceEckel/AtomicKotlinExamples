// Interoperability/Chameleon.java
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package Interoperability;
import java.io.Serializable;

public class Chameleon
        implements Serializable {
  private int size;
  private String color;
  public int getSize() {
    return size;
  }
  public void setSize(int newSize) {
    size = newSize;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String newColor) {
    color = newColor;
  }
}
