package com.javaprograms;

import java.util.Arrays;
import java.util.Random;

//Given an integer array, find sum and average of all elements?
public class SumAndAverage {

    public static void main(String[] args) {
        int[] input = new Random().ints(12, 50, 150).toArray();
        System.out.println("Input:" + Arrays.toString(input));

        System.out.println("Sum: " + Arrays.stream(input).sum());
        System.out.println("Average: " + Arrays.stream(input).average().getAsDouble());

    }


}
