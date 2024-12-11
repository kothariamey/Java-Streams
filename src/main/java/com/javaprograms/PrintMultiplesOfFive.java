package com.javaprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrintMultiplesOfFive {

//From the given list of integers, print the numbers which are multiples of 5?
    public static void main(String[] args) {
        var arr = IntStream.rangeClosed(1,100).boxed().toList();
        printMultiples(arr,5);
    }
    private static void printMultiples(List<Integer> arr, Integer n){
        arr.stream().filter(i -> i % 5 == 0 ).forEach(System.out::println);
    }

}
