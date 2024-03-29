import java.util.Queue;
import java.util.LinkedList;

public class Queues {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(6);
        queue.add(4);
        queue.add(9);
        System.out.println("queue elements " + queue);
        System.out.println("first element of the queue: " + queue.element());
        String removed = "element removed from the queue is: " + String.valueOf(queue.remove());
        System.out.println(removed);
        System.out.println("queue after removal " + queue);

        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(10);
        queue1.add(20);
        queue1.add(30);
        System.out.println("queue1 elements " + queue1);
        int QueueSum = 0;
        while (!queue1.isEmpty()) {
            QueueSum += queue1.remove();
        }
        queue1.add(QueueSum);
        System.out.println("Queue sum = " + queue1.element());


    }
}
