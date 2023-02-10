package Week2;

import java.util.Collections;
import java.util.PriorityQueue;

public class Opdracht_20_10 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(10);
        priorityQueue.add(1);
        priorityQueue.add(15);
        priorityQueue.add(100);

        priorityQueue.forEach(System.out::println);

        PriorityQueue<Integer> reversePriorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        reversePriorityQueue.addAll(priorityQueue);

        System.out.println();
        reversePriorityQueue.forEach(System.out::println);

    }
}
