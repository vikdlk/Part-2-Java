package _03Collections._07LinkedHashMap;

import _03Collections.Student;

import java.util.LinkedHashMap;

public class LinkedHashMapExm {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        Student st1 = new Student("Viktor", "Dulko", 4);
        Student st2 = new Student("Igor", "Stex", 2);
        Student st3 = new Student("Petia", "Vetrov", 1);
        Student st4 = new Student("Olia", "Muravina", 3);

        linkedHashMap.put(7.5, st3);
        linkedHashMap.put(9.5, st4);
        linkedHashMap.put(5.8, st1);
        linkedHashMap.put(6.4, st2);

        System.out.println("MyLinkedMap: " + linkedHashMap);
        System.out.println();
        System.out.println(linkedHashMap.get(6.4));
        System.out.println(linkedHashMap.get(7.5));
        System.out.println();
        System.out.println("MyLinkedMap: " + linkedHashMap);

    }
}
