package _03Collections._12Queue_interface;

import _03Collections.Student;

import java.util.PriorityQueue;

public class PriorityQueueExm2 {
    public static void main(String[] args) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        Student st1 = new Student("Viktor", "Dulko", 5);
        Student st2 = new Student("Laimis", "Izmailov", 1);
        Student st3 = new Student("Olia", "Vetrov", 2);
        Student st4 = new Student("Pavel", "Murko", 3);
        Student st5 = new Student("Igor", "Lama", 4);

        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);

        System.out.println("\nOriginal: " + priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

    }
}
