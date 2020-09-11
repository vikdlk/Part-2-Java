package _06Streams;

import java.util.ArrayList;
import java.util.List;

public class Exm14ParallelStream {

    //1 2 3 4 5..... 1 000 000 000
    //1 -> 250.000000
    //250.000001 -> 500.000000
    //500.000001 -> 750.000000
    //750.000001 -> 1000000000

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

//        PVZ 1
//        double sumResult = list.parallelStream().reduce((a, e) -> a + e).get();
//        System.out.println("SumResult = "+sumResult);

        double divisionResult = list.parallelStream().reduce((a, e) -> a / e).get();
        System.out.println("Division Result = " + divisionResult);

    }
}
