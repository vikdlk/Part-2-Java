package _02Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCart {
    public static void main(String[] args) {

        List<? extends Number> list30 = new ArrayList<Integer>();


        List<Double> list2 = new ArrayList<>();
        list2.add(3.14);
        list2.add(3.15);
        list2.add(3.16);

        List<String> list3 = new ArrayList<>();
        list3.add("Ok");
        list3.add("Privet");
        list3.add("Poka");

        showListInfo(list3);


        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(2.14);
        arrayList.add(2.15);
        arrayList.add(2.16);
        System.out.println(summ(arrayList));



    }

    static void showListInfo(List<?> list) {
        System.out.println("Moi list soderzit sledujuciie elementi " + list);
    }

    public static double summ(ArrayList<? extends Number> al) {
        double summ = 0;
        for (Number n : al) {
            summ += n.doubleValue();
        }
        return summ;
    }
}
