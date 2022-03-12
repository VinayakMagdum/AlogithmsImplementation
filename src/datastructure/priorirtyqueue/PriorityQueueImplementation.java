package datastructure.priorirtyqueue;
import java.util.PriorityQueue;

public class PriorityQueueImplementation {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(25);
        pq.add(-22);
        pq.add(1343);
        pq.add(54);
        pq.add(0);
        pq.add(-3492);
        pq.add(429);

        for(Integer num : pq) {
            System.out.println(num);
        }

//        System.out.println(pq.peek());
//        System.out.println(pq.remove(-3492));
//        System.out.println(pq.peek());
//        System.out.println(pq.poll());
//        System.out.println(pq.peek());

    }
}
