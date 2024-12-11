package com.javaprograms;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArraysToSingleSortedArrayRemoveDuplicates {
//How do you merge two unsorted arrays into single sorted array without duplicates?
    public static void main(String[] args) {
       int[] one= new Random().ints(30,100,150).toArray();
       System.out.println(Arrays.toString(one));

       int[] two= new Random().ints(30,100,150).toArray();
       System.out.println(Arrays.toString(two));

        int[] result=IntStream.concat(Arrays.stream(one), Arrays.stream(two)).distinct().sorted().toArray();
        System.out.println(Arrays.toString(result));

    }
}
