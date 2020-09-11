package _03Collections._01ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods6_List_Of {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Viktor");
        arrayList1.add("Ivan");
        arrayList1.add("Pavel");
        arrayList1.add("Dima");
        arrayList1.add("Inga");


        List<Integer> list1 = List.of(3, 8, 9);
        System.out.println(list1);
//        list1.add(100);

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);


    }
}
