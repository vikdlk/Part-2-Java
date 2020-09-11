package _03Collections._03LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExm1 {
    public static void main(String[] args) {
        Student s1 = new Student("Ivanov", 3);
        Student s2 = new Student("Nikolaj", 2);
        Student s3 = new Student("Elena", 1);
        Student s4 = new Student("Petr", 4);
        Student s5 = new Student("Marija", 3);

        List<Student> linkedList = new LinkedList<>();
        linkedList.add(s1);
        linkedList.add(s2);
        linkedList.add(s3);
        linkedList.add(s4);
        linkedList.add(s5);
        System.out.println("LinkedList: " + linkedList.get(2));
        Student s6 = new Student("Igor", 3);
        Student s7 = new Student("Olia", 2);

        linkedList.add(s6);
        System.out.println(linkedList);

        linkedList.add(0,s7);
        System.out.println(linkedList);

        linkedList.remove(s3);
        System.out.println(linkedList);


    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
