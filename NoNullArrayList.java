import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }

  public boolean add(T element) {
    this.checkVoid(element);
    return super.add(element);
  }

  private void checkVoid(T element) throws IllegalArgumentException {
    if (element == null) {
      throw new IllegalArgumentException ("\nReceived: " + element + " || Cannot add null to NoNullArrayList.");
    }
  }
}
