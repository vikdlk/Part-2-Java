package _05Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class StudentInfoPredicate {
    void testStudent(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolaj", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Piotr", 'm', 35, 4, 7);
        Student st5 = new Student("Marja", 'f', 23, 3, 9.1);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        StudentInfoPredicate info = new StudentInfoPredicate();

        Predicate<Student> p1= student -> student.avgGrade > 7.5;
        Predicate<Student> p2= student -> student.sex =='m';

//        info.testStudent(studentList, p1.and(p2));
        info.testStudent(studentList, p1.or(p2));


        Collections.sort(studentList, (s1, s2)->s1.course-s2.course );
//
//        System.out.println(studentList);

//        StudentChecks sc = (Student s )-> {return s.avgGrade > 8;};
//
//        System.out.println("----------------AVG---------------");
//        info.testStudent(studentList, s -> s.avgGrade > 8);
//
//        System.out.println("-------------age----------------");
//        info.testStudent(studentList, s -> s.age < 30);
//
//        System.out.println("---------------Mix------------------");
//        info.testStudent(studentList, (Student s) -> {
//            return s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f';
//        });
    }
}

//interface StudentChecks {
//    boolean check(Student s);
//}


//class CheckOverGrade implements StudentChecks {
//
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade > 8;
//    }
//}
