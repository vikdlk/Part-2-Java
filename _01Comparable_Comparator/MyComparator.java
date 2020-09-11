package _01Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparator {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student(23, "Anton", "Kananiuk", 10000);
        Student student2 = new Student(12, "Viktor", "Dulko", 5000);
        Student student3 = new Student(23, "Igor", "Stex", 2000);
        Student student4 = new Student(23, "Dima", "Lamarok", 1000);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        System.out.println("Before sort: " + studentList);
        Collections.sort(studentList, new MyNameComparator());
        System.out.println("After sorting: " + studentList);
    }
}

class Student {
    int id;
    String firstName;
    String lastName;
    int salary;

    public Student(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class MySalaryComparator implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2) {
        if (st1.salary == st2.salary) {
            return 0;
        } else if (st1.salary < st2.salary) {
            return -1;
        } else {
            return 1;
        }
    }
}

class MyNameComparator implements Comparator<Student>{
    @Override
    public int compare(Student st1, Student st2) {
        return st1.lastName.compareTo(st2.lastName);
    }
}
