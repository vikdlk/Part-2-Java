package _03Collections._12Queue_interface;

import java.util.PriorityQueue;

public class PriorityQueueExm1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue =new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(11);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.peek());
    }
}
