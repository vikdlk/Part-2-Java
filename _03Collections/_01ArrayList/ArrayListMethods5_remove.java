package _03Collections._01ArrayList;

import java.util.ArrayList;

public class ArrayListMethods5_remove {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Viktor");
        arrayList1.add("Ivan");
        arrayList1.add("Pavel");
        arrayList1.add("Dima");
        arrayList1.add("Inga");

        System.out.println("ArrayList = " + arrayList1);

        Object[] array = arrayList1.toArray();
        String[] array2 = arrayList1.toArray(new String[0]);

        for (String s: array2){
            System.out.println(s);
        }

//        List<String> myList = arrayList1.subList(0,3);
//        System.out.println(myList);
//        myList.add("Fiodor");
//        arrayList1.add("Sveta");
//        System.out.println(arrayList1);
//        System.out.println(myList);


//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Viktor");
//        arrayList2.add("Ivan");
//        arrayList2.add("Kolia");

//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1);

//        boolean result = arrayList1.containsAll(arrayList2);
//        System.out.println(result);


    }
}
