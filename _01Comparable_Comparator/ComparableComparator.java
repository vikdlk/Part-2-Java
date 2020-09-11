package _01Comparable_Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableComparator {
    public static void main(String[] args) {
        List<Students> myList = new ArrayList<>();

        Students stud1 = new Students(200, "Anton1", "Kananiuk", 10000);
        Students stud2 = new Students(40, "Viktor1", "Dulko", 5000);
        Students stud3 = new Students(10, "Igor1", "Stex", 2000);
        Students stud4 = new Students(1, "Dima1", "Lamarok", 1000);

        myList.add(stud1);
        myList.add(stud2);
        myList.add(stud3);
        myList.add(stud4);

        System.out.println("Before sort: " + myList);
        Collections.sort(myList, new NameComparator());
        System.out.println("ASorting by Name: " + myList);
        Collections.sort(myList, new SalaryComparator());
        System.out.println("Salary sort: " + myList);


    }
}

class Students implements Comparable<Students> {
    int id;
    String firstName;
    String lastName;
    int salary;

    public Students(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Students stud) {
        if (this.id == stud.id) {
            return 0;
        } else if (this.id < stud.id) {
            return -1;
        } else {
            return 1;
        }
//        return this.id-stud.id;
    }
}

class NameComparator implements Comparator<Students> {

    @Override
    public int compare(Students s1, Students s2) {
        return s1.firstName.compareTo(s2.firstName);
    }
}

class SalaryComparator implements Comparator<Students> {

    @Override
    public int compare(Students s1, Students s2) {
        if (s1.salary == s2.salary) {
            return 0;
        } else if (s1.salary < s2.salary) {
            return -1;
        } else {
            return 1;
        }
    }
}
