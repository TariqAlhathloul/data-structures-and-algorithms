import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(20);
        list.addFirst(10);
        list.add(30);
        list.addLast(40);
        System.out.println(list);
    }
}
