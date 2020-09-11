package _03Collections._01ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Viktor");
        arrayList1.add("Dima");
        arrayList1.add("Anton");
        arrayList1.add("Marija");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Vilnius");
        arrayList2.add("Kaunas");
        arrayList2.add("Lietuva");
        arrayList2.add("Riga");
        arrayList2.add("Latvija");


        List<String> list = new ArrayList<>(arrayList2);
        System.out.println("Pomestili prediduscij ArrayList2 v list: " + list);
        System.out.println(arrayList1 ==arrayList2);
    }
}
