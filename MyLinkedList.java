public class MyLinkedList {

  private int size;
  private Node start, end, current;

  public MyLinkedList() {
    size = 0;
    start = null;
    end = null;
    current = start;
  }

  public int size() {
    return size;
  }

  public boolean add(String value) {
    Node n = new Node(value);
    if ( size() == 0) {
      start = n;
      end = n;
      size++;
    }
    else {
      end.setNext(n);
      end = n;
      size++;
    }
    return true;
  }

  public boolean add(int index, String value) {
    reset();
    Node n = new Node(value);
    if (index = 0) {
      n.setNext(start);
      start = n;
      size++;
    }
    else {
      for(int i = 0; i < size; i++) {
        if (i == index) {
          n.setNext( current.getNext() );
          current.setNext(n);
        }
        next();
      }
    }
    return true;
  }

  public String get(int index) {
    reset();
    for(int i = 0; i < size; i++) {
      if (i == index) {
        return current.getData();
      }
      next();
    }
  }

  public String set(int index, String value) {
    reset();
    for(int i = 0; i < size; i++) {
      if (i == index) {
        current.setData(value);
        return value;
      }
      next();
    }
  }

  public String toString() {
    reset();
    String out = "";
    while(current != null) {
      out += current.getData() + ", ";
      next();
    }
    return out;
  }

  private void next() {
    current = current.getNext();
  }

  private void reset() {
    current = start;
  }

}
