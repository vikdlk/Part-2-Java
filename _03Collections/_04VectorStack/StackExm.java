package _03Collections._04VectorStack;

public class StackExm {
    static void abc1() {
        System.out.println("abc1 start");
        System.out.println("abc1 end");
    }

    static void abc2() {
        System.out.println("abc2 start");
        abc1();
        System.out.println("abc2 end");
    }

    static void abc3() {
        System.out.println("abc3 start");
        abc2();
        System.out.println("abc3 and");
    }

    public static void main(String[] args) {
        System.out.println("main Start");
        abc3();
        System.out.println("main end");
    }
}
