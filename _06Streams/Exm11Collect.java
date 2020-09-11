package _06Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exm11Collect {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolaj", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st6 = new Student("Olia", 'f', 19, 1, 7.5);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Marija", 'f', 23, 3, 7.4);

        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        studentList.add(st6);

//        Map<Integer, List<Student>> map = studentList.stream().map(el -> {
//            el.setName(el.getName().toUpperCase());
//            return el;
//        })
//                .collect(Collectors.groupingBy(el -> el.getCourse()));
//
//        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
//        }

        Map<Boolean, List<Student>> map =
                studentList.stream().collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7));

        for (Map.Entry<Boolean, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
        }


    }
}
