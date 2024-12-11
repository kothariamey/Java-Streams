package com.javaprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArraysToSingleSortedArray {
//How do you merge two unsorted arrays into single sorted array using Java 8 streams?
    public static void main(String[] args) {
       int[] one= new Random().ints(10,100,200).toArray();
       System.out.println(Arrays.toString(one));

       int[] two= new Random().ints(10,300,600).toArray();
       System.out.println(Arrays.toString(two));

        int[] result=IntStream.concat(Arrays.stream(one), Arrays.stream(two)).sorted().toArray();
        System.out.println(Arrays.toString(result));

    }
}
