package _03Collections._05HashMap;

import java.util.HashMap;
import java.util.Map;

public class hashCodeExm1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student s1 = new Student("Viktor", "Dulko", 4);
        Student s2 = new Student("Olia", "Presniakova", 3);
        Student s3 = new Student("Dima", "Petrov", 2);
        Student s4 = new Student("Igor", "Stax", 1);
        map.put(s1, 7.5);
        map.put(s2, 5.5);
        map.put(s3, 9.5);
        map.put(s4, 8.5);
        System.out.println("Student List: " + map);
        System.out.println(map.containsKey(s1));
        System.out.println(s1.hashCode());
        s1.course=5;
        System.out.println(map.containsKey(s1));
        System.out.println(s1.hashCode());


//        Student s5 = new Student("Viktor", "Dulko", 4);
//        Student s6 = new Student("Vilnius", "Lazdynai", 3);

//        boolean result = map.containsKey(s5);
//        System.out.println("Result: " + result);

//        System.out.println(s1.hashCode());
//        System.out.println(s5.hashCode());

//        for (Map.Entry<Student, Double> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }


    }
}


class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return surname != null ? surname.equals(student.surname) : student.surname == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + course;
        return result;
    }


}