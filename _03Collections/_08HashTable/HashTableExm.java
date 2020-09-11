package _03Collections._08HashTable;

import _03Collections.Student;

import java.util.Hashtable;

public class HashTableExm {
    public static void main(String[] args) {
        Hashtable<Double, Student> ht = new Hashtable<>();
        Student st1 = new Student("Viktor", "Dulko", 4);
        Student st2 = new Student("Igor", "Stex", 2);
        Student st3 = new Student("Petia", "Vetrov", 1);
        Student st4 = new Student("Olia", "Muravina", 3);
        Student st5 = new Student("Olia", "Muravina", 3);

        ht.put(5.5, st1);
        ht.put(6.5, st2);
        ht.put(7.5, st3);
        ht.put(8.5, st4);
        ht.put(10.5, st5);

        System.out.println("HashTable: " + ht);
    }
}
