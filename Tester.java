public class Tester {

  public static void main(String[] args) {
    MyLinkedList l = new MyLinkedList();
    l.add("pain");
    l.add("agony");
    l.add("suffering");
    System.out.println( l.toString() );
    l.add(1, "hopelessness");
    l.add(0, "depression");
    System.out.println( l.toString() );
    l.set(3, "despair");
    System.out.println( l.toString() );
    System.out.println( l.get(1) );
    System.out.println( l.get(3) );
  }

}
