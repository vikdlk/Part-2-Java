package _02Generics.Game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Marija", 15);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Ksenija", 18);

        Employees employees1 = new Employees("Viktor", 35);
        Employees employees2 = new Employees("Dima", 40);

        Team<Schoolar> schoolarTeam = new Team<>("Drakoni");
        Team<Student> studentTeam = new Team<>("Vperiod");
        Team<Employees> employeesTeam = new Team<>("Rabotiagi");

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeesTeam.addNewParticipant(employees1);
        employeesTeam.addNewParticipant(employees2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Mudreci");

        Schoolar schoolar3 = new Schoolar("Sergej", 12);
        Schoolar schoolar4 = new Schoolar("Nina", 14);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam.playWith(schoolarTeam2);

    }
}
