package _03Collections._09HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExm1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
//        Student st1 = new Student("Viktoras", "Dulko", 4, 'm');
//        Student st2 = new Student("Igor", "Stex", 2, 'm');
//        Student st3 = new Student("Petia", "Vetrov", 1, 'm');
//        Student st4 = new Student("Olia", "Muravina", 3, 'f');
//        Student st5 = new Student("Olia", "Muravina", 3, 'f');

        set.add("Oleg");
        set.add("Marina");
        set.add("Vasia");
        set.add("Dima");
        set.add("Viktor");
        System.out.println("HashSet: " + set);
        System.out.println(set.contains("Lama"));


//        for (String s: set){
//            System.out.println(s);
//        }


    }
}
