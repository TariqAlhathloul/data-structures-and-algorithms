package LinkedList;

public class Main {
    public static void main(String[] args) {

        linkedList list = new linkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.indexOf(8);
        list.contains(10);
        list.print();
        list.removeFirst();
        list.print();
    }
}
