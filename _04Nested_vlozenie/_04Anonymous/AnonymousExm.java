package _04Nested_vlozenie._04Anonymous;

public class AnonymousExm {
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(m.doOperation(3,5));
    }

}

interface Math {
    int doOperation(int a, int b);
}
