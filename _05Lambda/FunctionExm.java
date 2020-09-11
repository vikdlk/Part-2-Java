package _05Lambda;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExm {
    public static void main(String[] args) {
        Student st1 = new Student("Ivanas", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikola", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elen", 'f', 19, 1, 8.9);
        Student st4 = new Student("Piotras", 'm', 35, 4, 7);
        Student st5 = new Student("Marjas", 'f', 23, 3, 9.1);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        Function<Student, Double> f = student -> student.avgGrade;
        double res = avgOfSome(studentList, student -> (double)student.age);
        System.out.println(res);
    }

    private static double avgOfSome(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student st : list) {
            result += f.apply(st);
        }
        result = result / list.size();
        return result;

    }

}
