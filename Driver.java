import java.util.ArrayList;

public class Driver {
  public static void main(String[] args) {
    NoNullArrayList<String> a = new NoNullArrayList<String>();
    a.add("Bruh");
    System.out.println(a);
    try {
      a.add(null);
    } catch (IllegalArgumentException e) {
      System.out.println("Correct error.");
    }
  }
}
