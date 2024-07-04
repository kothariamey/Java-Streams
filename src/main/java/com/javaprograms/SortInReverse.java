package com.javaprograms;

import java.util.*;

//Sort the given list of decimals in reverse order?
public class SortInReverse {

    public static List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

    public static void main(String[] args) {
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    public static void implement(){

    }
}
