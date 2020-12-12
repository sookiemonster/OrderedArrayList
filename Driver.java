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

    //Set() Tests
    System.out.println();
    System.out.println("Set() tests:");
    System.out.println(c);
    System.out.println("8: " + c.set(0, 27));
    System.out.println(c);
    try {
      c.set(0, null);
    } catch (IllegalArgumentException e) {
      System.out.println("Correct error. Set(int index, element)");
    }

    // OrderedArrayList testing-------------------
    System.out.println();
    System.out.println("OrderedArrayList testing: ");
    OrderedArrayList<Integer> n = new OrderedArrayList<Integer>();
    OrderedArrayList<Integer> p = new OrderedArrayList<Integer>(10);

    // try {
    //   OrderedArrayList<String> foo = new OrderedArrayList<String>();
    // } catch (ClassCastException e) {
    //   System.out.println("Strings are not comparable.");
    // }
    // System.out.println(n.getOrder(5));
    // n.add(5);
    // System.out.println(n);
    // System.out.println("6 location: " + n.getOrder(6));
    // System.out.println("4 location: " + n.getOrder(4));
    // n.add(4);
    // n.add(6);
    // System.out.println(n);
    // System.out.println("5 location: " + n.getOrder(5));\
    n.add(5);
    System.out.println(n);
    n.add(4);
    System.out.println(n);
    n.add(6);
    System.out.println(n);
    n.add(5);
    System.out.println(n);
    n.add(-35);
    System.out.println(n);

    System.out.println();
    OrderedArrayList<String> foo = new OrderedArrayList<String>(10);
    foo.add("abc");
    System.out.println(foo);
    foo.add("ab");
    System.out.println(foo);
    foo.add("abcd");
    System.out.println(foo);
    foo.add("dxy");
    System.out.println(foo);
    foo.add("a");
    System.out.println(foo);






  }
}
