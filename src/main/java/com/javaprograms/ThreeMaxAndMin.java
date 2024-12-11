package com.javaprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ThreeMaxAndMin {
//How do you get three maximum numbers and three minimum numbers from the given list of integers?
    public static void main(String[] args) {
        List<Integer> arr= new Random().ints(10,100,550).boxed().toList();
        System.out.println("Input Array: "+ arr.stream().sorted().toList());

        List<Integer> minThree=arr.stream().sorted().limit(3).toList();
        System.out.println("Min Three: "+minThree);

        List<Integer> maxThree=arr.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println("Min Three: "+maxThree);

    }
}
