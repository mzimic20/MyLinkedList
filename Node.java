public class Node {

  private String data;
  private Node next, prev;

  public Node(String value) {
    data = value;
    next = null;
    prev = null;
  }

  public void setData(String value) {
    data = s;
  }

  public void setNext(Node n) {
    next = n;
  }

  public void setPrev(Node n) {
    prev = n;
  }

  public String getData() {
    return data;
  }

  public Node getNext() {
    return next;
  }

  public Node getPrev() {
    return prev;
  }

}
