package _03Collections._10TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExm1 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(-10);

        System.out.println(treeSet);
        treeSet.remove(10);
        System.out.println(treeSet);
        System.out.println(treeSet.contains(1));


    }
}
