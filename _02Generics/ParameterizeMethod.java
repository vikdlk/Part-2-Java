package _02Generics;

import java.util.ArrayList;

public class ParameterizeMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(5);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("10");
        al2.add("20");
        al2.add("5");
        String b = GenMethod.getSecondElement(al2);
        System.out.println(b);
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}