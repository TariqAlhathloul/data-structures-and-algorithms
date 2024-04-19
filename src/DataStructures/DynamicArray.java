package DataStructures;
import java.util.ArrayList;
public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(90);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.remove(0);
        System.out.println(list.indexOf(20));
        System.out.println(list.contains(100));
        System.out.println(list.lastIndexOf(30));
        System.out.println(list);
    }
}
