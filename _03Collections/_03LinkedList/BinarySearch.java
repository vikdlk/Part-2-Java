package _03Collections._03LinkedList;


import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

//        Integer[] myNumber = {500, 15, 0, 36, -45, -800, -400, -100, -52, 50, 100, 150, 1, 99, 10, 42,
//                8465, 558, 9333, 10011, 456, 5685, 785, -654, -5646};
//        List<Integer> myList = Arrays.asList(myNumber);
//        System.out.println("Unsorted: " + myList);
//
//        Collections.sort(myList);
//        System.out.println("Sorted: " + myList);
//        Collections.reverse(myList);
//        System.out.println("Reverse: " + myList);
//
//        Collections.shuffle(myList);
//        System.out.println(myList);
//
//        int index = Collections.binarySearch(myList, -45);
//        System.out.println("Index = " + index);

//        Employee emp1 = new Employee(100, "Vasia", 12345);
//        Employee emp2 = new Employee(1, "Antnon", 42414);
//        Employee emp3 = new Employee(1, "Olia", 2000);
//        Employee emp4 = new Employee(182, "Nora", 5000);
//        Employee emp5 = new Employee(33, "Igor", 54889);
//        Employee emp6 = new Employee(55, "Dasha", 1000);
//        Employee emp7 = new Employee(101, "Nastia", 455855);
//
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(emp1);
//        employeeList.add(emp2);
//        employeeList.add(emp3);
//        employeeList.add(emp4);
//        employeeList.add(emp5);
//        employeeList.add(emp6);
//        employeeList.add(emp7);
//
//        System.out.println("UnsSorted List: " + employeeList);
//        Collections.sort(employeeList);
//        System.out.println("Sort with Comparable: " + employeeList);
//        int index2 = Collections.binarySearch(employeeList, new Employee(182, "Nora", 5000));
//        System.out.println("Index2: " + index2);


        int[] myNumber = {500, 15, 0, 36, -45, -800, -400, -100, -52, 50, 100, 150, 1, 99, 10, 42,
                8465, 558, 9333, 10011, 456, 5685, 785, -654, -5646};
        System.out.println("Unsorted: " + Arrays.toString(myNumber));
        Arrays.sort(myNumber);
        System.out.println("Sort: " + Arrays.toString(myNumber));
        int index = Arrays.binarySearch(myNumber, 456);
        System.out.println(index);

    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        int result = this.id - employee.id;
        if (result == 0) {
            result = this.name.compareTo(employee.name);
        }
        return result;
    }

//    @Override
//    public int compareTo(Employee employee) {
//        if (this.id == employee.id) {
//            return 0;
//        } else if (this.id < employee.id) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }
}
