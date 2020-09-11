package _02Generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

//        list.add("Ok");
//        list.add(12);
//        list.add(new StringBuilder("Viktor"));
//        list.add(new Car());

        list.add("privet");
        list.add("poka");
        list.add("privet privet");
        list.add("ok");
//        list.add(new Car());

        for (Object o : list) {
            System.out.println(o + " dlina: " + ((String) o).length());
        }
    }
}


class Car {

}
