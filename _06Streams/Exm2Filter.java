package _06Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exm2Filter {
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

        studentList = studentList.stream().filter(element -> element.getAge() > 22 && element.getAvgGrade() < 7.2).
                collect(Collectors.toList());
        System.out.println(studentList);

//        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
//        myStream.filter(el
//                ->el.getAge()> 22 && el.getAvgGrade()<7.2)
//                .collect(Collectors.toList());
//
//        System.out.println(myStream);

    }
}
