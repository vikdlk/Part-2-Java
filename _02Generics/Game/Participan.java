package _02Generics.Game;

public abstract class Participan {
    private String name;
    private int age;

    public Participan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

