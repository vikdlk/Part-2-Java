package _03Collections._01ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 'm', 22, 3, 5.5);
        Student s2 = new Student("Viktor", 'm', 21, 3, 6);
        Student s3 = new Student("Marija", 'f', 24, 4, 10);
        Student s4 = new Student("Dima", 'm', 18, 1, 9.5);
        Student s5 = new Student("Olia", 'f', 27, 6, 6.5);


        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        studentsList.add(s4);
        studentsList.add(s5);
//        studentsList.add(s6);
        System.out.println(studentsList);
        Student s6 = new Student("Olia", 'f', 27, 6, 6.5);
        studentsList.remove(s6);
        System.out.println(studentsList);

    }

}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }


}
