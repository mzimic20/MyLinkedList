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
      n.setPrev(end);
      end.setNext(n);
      end = n;
      size++;
    }
    return true;
  }

  public boolean add(int index, String value) {
    if (index < 0 || index > size) throw new IndexOutOfBoundsException("" + index + " is not a valid index");
    reset();
    Node N, P;
    Node n = new Node(value);
    if (index == 0) {
      n.setNext(start);
      start.setPrev(n);
      start = n;
      size++;
    }
    else if (index == size) {
      n.setPrev(end);
      end.setNext(n);
      end = n;
      size++;
    }
    else {
      for(int i = 0; i < size; i++) {
        if (i == index - 1) {
          N = current.getNext();
          P = current;
          n.setNext(N);
          n.setPrev(P);
          ( current.getNext() ).setPrev(n);
          current.setNext(n);
        }
        next();
      }
      size++;
    }
    return true;
  }

  public String get(int index) {
    if (index < 0 || index > size) throw new IndexOutOfBoundsException("" + index + " is not a valid index");
    reset();
    String out = "";
    for(int i = 0; i < size; i++) {
      if (i == index) {
        out = current.getData();
      }
      next();
    }
    return out;
  }

  public String set(int index, String value) {
    reset();
    for(int i = 0; i < size; i++) {
      if (i == index) {
        current.setData(value);
      }
      next();
    }
    return value;
  }

  public String toString() {
    reset();
    String out = "[";
    while(current != end) {
      out += current.getData() + ", ";
      next();
    }
    return out + end.getData() + "]";
  }

  public String toStringReversed() {
    current = end;
    String out = "[";
    while(current != start) {
      out += current.getData() + ", ";
      prev();
    }
    return out + start.getData() + "]";
  }

  private void next() {
    current = current.getNext();
  }

  private void prev() {
    current = current.getPrev();
  }

  private void reset() {
    current = start;
  }

}
