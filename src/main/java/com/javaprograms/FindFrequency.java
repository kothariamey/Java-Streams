package com.javaprograms;

import java.util.function.Function;
import java.util.stream.Collectors;

//How do you find frequency of each character in a string using Java 8 streams?
public class FindFrequency {
    public static String inputString = "Java Concept Of The Day";

    public static void main(String[] args) {
        implement();
    }

    public static void implement() {
        System.out.println(inputString.toLowerCase().replaceAll("\\s+", "").chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }

}
