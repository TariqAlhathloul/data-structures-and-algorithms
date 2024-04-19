package DataStructures;
import java.util.NoSuchElementException;

// void addFirst ( int )
// void addLast ( int )
// void removeFirst (  )
// void removeLast (  )
// int indexOf ( int )
// boolean contains ( int )
// boolean isEmpty (  )
// void print ( )


public class linkedList {
    private Node Head;
    private Node Tail;
    private static class Node {
        private final int value;
        private Node next;
        private Node (int value) {
            this.value = value;
        }
    }
    public void addFirst(int item) {
        Node obj = new Node(item);
        if(isEmpty()) {
            Head = Tail = obj;
        } else {
            Head.next = obj;
        }
    }
    public void addLast(int item) {
        Node obj = new Node(item);
        if(Head == null) {
            Head = Tail = obj;
        } else {
            Tail.next = obj;
            Tail = obj;
        }
    }
    public void removeFirst() {
        if(isEmpty()) throw new NoSuchElementException();
        if( Head == Tail) {
            Head = Tail = null;
            return;
        }
        var second = Head.next;
        Head.next = null;
        Head = second;
    }
    public int indexOf(int item) {
        int index = 0;
        var current = Head;
        while ( current != null) {
            if(current.value == item) {
                System.out.println("Value: " + item + " is at index [" + index + "]");
                return index;
            }
            current = current.next;
            index++;
        }
        System.out.println("Value: " + item + " is not found");
        return -1;
    }
    public boolean contains(int item) { return indexOf( item ) != -1; }
    private boolean isEmpty () { return Head == null; }

    void print () {
        System.out.println();
        var current = Head;
        while( current != null) {
            System.out.print(current.value + ", ");
            current = current.next;
        }
        System.out.println();
    }
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
