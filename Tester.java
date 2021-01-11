public class Tester {

  public static void main(String[] args) {
    MyLinkedList l = new MyLinkedList();
    l.add("pain");
    l.add("agony");
    l.add("suffering");
    System.out.println(l);
    l.add(1, "hopelessness");
    l.add(0, "depression");
    System.out.println(l);
    l.set(3, "despair");
    System.out.println(l);
    System.out.println( l.toStringReversed() );
    System.out.println( l.get(1) );
    System.out.println( l.get(3) );
    System.out.println( l.get(4) );

    MyLinkedList w = new MyLinkedList();
    w.add("kokos");
    System.out.println(w);
    w.remove(0);
    System.out.println(w);

    w.add("kokos");
    w.add("hrana");
    w.add("jabuka");
    w.add("kruska");
    w.add("sljivovica");
    System.out.println(w);
    w.remove(0);
    System.out.println(w);
    w.remove(3);
    System.out.println(w);

    w.add(0, "kokos");
    w.add("sljivovica");
    System.out.println(w);
    w.remove(2);
    System.out.println(w);

    l.extend(w);
    System.out.println(l);
    System.out.println(w);
  }

}
