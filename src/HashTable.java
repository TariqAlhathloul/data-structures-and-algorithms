
import java.util.Hashtable;

public class HashTable {


    public static void main(String[] args) {

        Hashtable<Integer, String> hash = new Hashtable<>();
        hash.put(22001, "Tariq");
        hash.put(22002, "Hassan");
        hash.put(22003, "Mohammed");
        hash.put(22004, "Faris");
        hash.put(22005, "Amar");

        for(Integer h : hash.keySet())
        System.out.println(h);
    }

}
