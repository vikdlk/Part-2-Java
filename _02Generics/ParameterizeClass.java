package _02Generics;

public class ParameterizeClass {
    public static void main(String[] args) {

//        Info<String> info1 = new Info<>("hello");
//        System.out.println(info1);
//        String s = info1.getValue();
//
//        Info<Integer> info2 = new Info<>(22);
//        System.out.println(info2);
//        Integer in = info2.getValue();

    }

//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }

}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" + value +
                '}';
    }

    public T getValue() {
        return value;
    }
}

class Parent{
    public void abc(Info<String> info){
        String s = info.getValue();
    }
}

class Child extends Parent{
    public void abc(Info<String> info){
        String s = info.getValue();
    }
}
