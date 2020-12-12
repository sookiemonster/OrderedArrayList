import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int capacity) {
    super(capacity);
  }

  public boolean add(T element) {
    this.checkVoid(element);
    return super.add(element);
  }

  public void add(int index, T element) {
    this.checkVoid(element);
    super.add(index, element);
  }

  private void checkVoid(T element) throws IllegalArgumentException {
    if (element == null) {
      throw new IllegalArgumentException ("\nReceived: " + element + " || Cannot add null to NoNullArrayList.");
    }
  }
}
