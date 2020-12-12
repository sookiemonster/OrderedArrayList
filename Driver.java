import java.util.ArrayList;

public class Driver {
  public static void main(String[] args) {
    System.out.println("String tests: ");
    NoNullArrayList<String> a = new NoNullArrayList<String>();
    a.add("Bruh");
    System.out.println(a);
    // String x = null;
    // System.out.println("Null test: " + (x == null));
    try {
      a.add(null);
    } catch (IllegalArgumentException e) {
      System.out.println("Correct error. Add(element)");
    }

    a.add(0, "secondadd");
    System.out.println(a);
    try {
      a.add(1, null);
    } catch (IllegalArgumentException e) {
      System.out.println("Correct error. Add(int index, element)");
    }

    System.out.println();
    System.out.println("Integer tests:");
    NoNullArrayList<Integer> b = new NoNullArrayList<Integer>();
    b.add(7);
    System.out.println(b);
    b.add(0, 6);
    System.out.println(b);
    // Integer y = null;
    // System.out.println("Null test: " + (y == null));
    try {
      b.add(null);
    } catch (IllegalArgumentException e) {
      System.out.println("Correct error. Add(element)");
    }
    try {
      b.add(1, null);
    } catch (IllegalArgumentException e) {
      System.out.println("Correct error. Add(int index, element)");
    }

    //Second constructor test
    System.out.println();
    System.out.println("Second constructor tests:");
    NoNullArrayList<Integer> c = new NoNullArrayList<Integer>(10);
    c.add(9);
    System.out.println(c);
    c.add(0, 8);
    System.out.println(c);

    try {
      c.add(null);
    } catch (IllegalArgumentException e) {
      System.out.println("Correct error. Add(element)");
    }
    try {
      c.add(1, null);
    } catch (IllegalArgumentException e) {
      System.out.println("Correct error. Add(int index, element)");
    }
  }
}
