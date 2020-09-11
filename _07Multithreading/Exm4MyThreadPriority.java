package _07Multithreading;

public class Exm4MyThreadPriority {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("Vilnius");
        myThread5.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Name of myThread5 = " + myThread5.getName() +
                " Priority of myThread5 = " + myThread5.getPriority());

    }
}


class MyThread5 extends Thread {
    public void run() {
        System.out.println("Privet");
    }
}