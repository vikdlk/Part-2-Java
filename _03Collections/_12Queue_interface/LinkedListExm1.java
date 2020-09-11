package _03Collections._12Queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExm1 {
    public static void main(String[] args) {
        Queue<String> queue= new LinkedList<>();
        queue.add("Viktor");
        queue.add("Ivan");
        queue.add("Marija");
        queue.add("Laimis");
        queue.add("Olia");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.element());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
