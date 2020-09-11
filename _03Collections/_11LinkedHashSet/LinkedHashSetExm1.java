package _03Collections._11LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetExm1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(5);
        lhs.add(3);
        lhs.add(1);
        lhs.add(8);
        lhs.add(10);

        System.out.println("Original Set: "+lhs);
        lhs.remove(8);
        System.out.println(lhs);
        System.out.println(lhs.contains(1));

    }
}
