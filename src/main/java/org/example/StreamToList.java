package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {
    public static void main(String[] args) {
        oldAndNewStyle();
    }

    private static void oldAndNewStyle() {
        Stream<String> stringStream = Stream.of("a", "b", "c");
        System.out.println("--------Old Style Java 11-----------");
        List<String> stringList11 =  stringStream.collect(Collectors.toList());
        stringList11.forEach(System.out::println);

        System.out.println("--------New Style Java 17-----------");
        List<String> stringList17 =  stringStream.toList();
        stringList17.forEach(System.out::println);
    }
}
