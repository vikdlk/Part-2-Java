package _06Streams;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Exm12FindFirst {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolaj", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Marija", 'f', 23, 3, 7.4);

        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        Student first = studentList.stream().map(el -> {
            el.setName(el.getName().toUpperCase());
            return el;
        })
                .filter(el -> el.getSex() == 'f')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .findFirst().get();
//                .forEach(el -> System.out.println(el));
        System.out.println(first);

    }
}
