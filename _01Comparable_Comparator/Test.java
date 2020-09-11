package _01Comparable_Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(99);
        list.add(30);
        list.add(2);
        list.add(1);
        list.add(34);

        System.out.println("Pered sortirovkoj: "+ list);
        Collections.sort(list);
        System.out.println("Posle sortirovki: "+list);

    }
}
