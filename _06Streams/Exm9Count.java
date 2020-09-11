package _06Streams;

import java.util.stream.Stream;

public class Exm9Count {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 6, 5, 3, 1, 1, 1);
        Stream<String> stream2 = Stream.of("privet", "poka", "ok");
//        System.out.println(stream.count());
//        System.out.println(stream.distinct().count());

        System.out.println(stream.peek(System.out::println).count());
    }
}
