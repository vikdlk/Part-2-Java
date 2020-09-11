package _03Collections._06TreeMap;


import _03Collections.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExm {
    public static void main(String[] args) {
        TreeMap<Student,Double> treeMap = new TreeMap<>();
        Student st1 = new Student("Viktor", "Dulko", 4);
        Student st2 = new Student("Igor", "Stex", 2);
        Student st3 = new Student("Petia", "Vetrov", 1);
        Student st4 = new Student("Olia", "Muravina", 3);
        Student st5 = new Student("Dima", "Slepuxa", 2);
        Student st6 = new Student("Alla", "Pazej", 1);
        Student st7 = new Student("Inga", "Rudis", 3);
        Student st8 = new Student("Viktor", "Dulko", 4);

        treeMap.put(st8, 9.9);
        treeMap.put(st4, 7.3);
        treeMap.put(st3, 7.2);
        treeMap.put(st5, 7.9);
        treeMap.put(st2, 6.4);
        treeMap.put(st7, 9.1);
        treeMap.put(st1, 5.8);
        treeMap.put(st6, 8.2);
        System.out.println(treeMap);
        Student st9 = new Student("Inga", "Rudis", 3);
        System.out.println(treeMap.containsKey(st9));

//-----------------------------------
//        treeMap.put(5.8, st1);
//        treeMap.put(6.4, st2);
//        treeMap.put(7.2, st3);
//        treeMap.put(7.9, st5);
//        treeMap.put(8.0, st4);
//        treeMap.put(8.5, st6);
//        treeMap.put(9.1, st7);
//        treeMap.put(9.9, st8);
//
//        System.out.println("My Student: " + treeMap);
//        System.out.println("TreeMap size is: " + treeMap.size());
//        System.out.println("Method get: " + treeMap.get(9.9));
//        System.out.println("Method remove: " + treeMap.remove(6.4));
//        System.out.println("TreeMap size is: " + treeMap.size());
//        System.out.println("DescendingMap: " + treeMap.descendingMap());
//        System.out.println(treeMap.headMap(9.0));
//-------------------------------------------
    }
}
