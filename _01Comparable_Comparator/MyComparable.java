package _01Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyComparable {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee(100, "Viktor", "Dulko", 9999);
        Employee emp2 = new Employee(25, "Anton", "Stex", 4500);
        Employee emp3 = new Employee(1, "Anton", "Kononiuk", 1500);

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        System.out.println("Before sorting: \n" + employeeList);
        Collections.sort(employeeList);
        System.out.println("After sorting: " + employeeList);


    }
}


class Employee implements Comparable<Employee> {
    int id;
    String firstName;
    String lastName;
    int salary;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
//        if (this.id == employee.id) {
//            return 0;
//        } else if (this.id < employee.id) {
//            return -1;
//        } else {
//            return 1;
//        }
//        2---------------------------
//        return this.id-employee.id;
//        3---------------------------
//        return this.firstName.compareTo(employee.firstName);
//        4----------------------------
        int res = this.firstName.compareTo(employee.firstName);
        if (res == 0) {
            res = this.lastName.compareTo(employee.lastName);
        }
        return res;
    }
}
