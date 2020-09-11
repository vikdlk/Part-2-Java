package _03Collections._04VectorStack;

import java.util.Vector;

public class VectorExm {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Ivan");
        vector.add("Ira");
        vector.add("Katia");
        vector.add("Oleg");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));
    }
}
