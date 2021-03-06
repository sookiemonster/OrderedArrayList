import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int capacity) {
    super(capacity);
  }

  private int getOrder(T item) {
    checkVoid(item);
    if (this.size() == 0) {
      return 0;
    }
    for (int i = 0; i < this.size(); i++) {
      if (item.compareTo(this.get(i)) <= 0) {
        return (i);
      }
    }
    return this.size();
  }

  public boolean add(T element) {
    super.add(this.getOrder(element), element);
    return true;
  }

  public void add(int index, T element) {
    this.add(element);
  }

  public T set(int index, T element) {
    checkVoid(element);
    T temp = this.remove(index);
    this.add(element);
    return temp;
  }

  private void checkVoid(T element) throws IllegalArgumentException {
    if (element == null) {
      throw new IllegalArgumentException ("\nReceived: " + element + " || Cannot add null to NoNullArrayList.");
    }
  }
}
