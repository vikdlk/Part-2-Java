package _03Collections;



import java.util.Objects;

public class Student implements Comparable<Student> {
    String firstName;
    String lastName;
    int course;

    public Student() {
    }

    public Student(String firstName, String lastName, int course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

       return  course==student.course;
    }

    @Override
    public int hashCode() {
       return Objects.hashCode(course);
    }
    //    @Override
//    public int compareTo(Student student) {
//        int result = this.firstName.compareTo(student.firstName);
//        if (result == 0) {
//            result = this.lastName.compareTo(student.lastName);
//        }
//        return result;
//    }


}

