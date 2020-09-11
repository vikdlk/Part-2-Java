package _06Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Exm1StreamMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela");
        list.add("OK");
        list.add("poka");

//        for (int i = 0; i <list.size() ; i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
        //PVZ 1
        List<Integer> list2 = list.stream().map(el -> el.length()).collect(Collectors.toList());
        System.out.println(list2);

        //PVZ 2 iz massiva stream
        int[] array = {5, 9, 3, 8, 1};
        array = Arrays.stream(array).map(element2 -> {
            if (element2 % 3 == 0) {
                element2 = element2 / 3;
            }
            return element2;
        }).toArray();
//        System.out.println(Arrays.toString(array));

        //PVZ 3 Primer s Set
        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");
//        System.out.println(set);

//        Set<Integer>mySet = set.stream().map(e->e.length()).collect(Collectors.toSet());
        List<Integer> mySet = set.stream().map(e -> e.length()).collect(Collectors.toList());
//        System.out.println(mySet);


    }
}
