package _03Collections._01ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("Viktor");
        arrayList1.add("Dima");
        arrayList1.add("Anton");
        arrayList1.add("Marija");
        arrayList1.add(1, "Misha");

//        for (String s : arrayList1) {
//            System.out.print(s + " ");
//        }

//        for (int i = 0; i < arrayList1.size(); i++) {
//            System.out.print(arrayList1.get(i) + " ");
//        }

        arrayList1.set(1, "Lazdynai");
        System.out.println(arrayList1);


    }
}
