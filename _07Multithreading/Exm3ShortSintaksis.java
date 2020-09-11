package _07Multithreading;

public class Exm3ShortSintaksis {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("privet");
            }
        }).start();
        new Thread(() -> System.out.println("privet")).start();
    }
}
