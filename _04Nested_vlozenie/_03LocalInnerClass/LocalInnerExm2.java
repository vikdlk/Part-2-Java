package _04Nested_vlozenie._03LocalInnerClass;

public class LocalInnerExm2 {
    public static void main(String[] args) {
        class Slozenie implements Math2 {

            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }
        Slozenie slozenie = new Slozenie();
        System.out.println(slozenie.doOperation(4,23));
    }
}

interface Math2 {
    int doOperation(int a, int b);
}
