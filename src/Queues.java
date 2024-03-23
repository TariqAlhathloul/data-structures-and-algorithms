import java.util.Queue;
import java.util.LinkedList;

public class Queues {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Tariq");
        queue.offer("Khalid");
        queue.offer("Mohammed");
        queue.offer("Hussein");

        System.out.println(queue);

    }
}
