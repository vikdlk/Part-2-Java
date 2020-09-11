package _03Collections._02Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExm {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Viktor");
        arrayList1.add("Ivan");
        arrayList1.add("Pavel");
        arrayList1.add("Dima");
        arrayList1.add("Inga");

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()){
            iterator.next();
            System.out.println(iterator.next());
        }
        // Udolenie elementov
//        Iterator<String> iterator = arrayList1.iterator();
//        while (iterator.hasNext()){
//            iterator.next();
//            iterator.remove();
//        }
//        System.out.println(arrayList1);
    }
}
