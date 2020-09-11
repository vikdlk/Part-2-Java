package _03Collections._10TreeSet;

import _03Collections.Student;

import java.util.TreeSet;

public class TreeSetExm2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Viktor", "Dulko", 4);
        Student st2 = new Student("Igor", "Stex", 3);
        Student st3 = new Student("Inga", "Rudis", 1);
        Student st4 = new Student("Dima", "Slepuxa", 2);
        Student st5 = new Student("Pavel", "Zamaro", 4);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println("Student List: " + treeSet);
        Student st6 = new Student("Olia", "Muravina", 3);
        System.out.println("HeadSet:" + treeSet.headSet(st6));
        System.out.println(st1.equals(st5));
        System.out.println(st1.hashCode()== st5.hashCode());
    }
}
