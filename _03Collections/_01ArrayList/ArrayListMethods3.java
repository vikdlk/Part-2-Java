package _03Collections._01ArrayList;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Viktor");
        arrayList1.add("Ivan");
        arrayList1.add("Pavel");
        arrayList1.add("Dima");
        arrayList1.add("Inga");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1.size());

        System.out.println(arrayList1.contains("Dima"));
    }

}
