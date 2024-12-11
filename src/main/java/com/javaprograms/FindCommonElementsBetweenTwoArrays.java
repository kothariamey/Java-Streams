package com.javaprograms;

import java.util.Map;
import java.util.Random;
import java.util.List;
import java.util.stream.Collectors;

//How do you find common elements between two arrays?
public class FindCommonElementsBetweenTwoArrays {

    public static void main(String[] args) {
        List<Integer> inputOne= new Random().ints(10,50,65).distinct().boxed().toList();
        System.out.println("First Input List:"+inputOne);

        List<Integer> inputTwo= new Random().ints(10,50,65).distinct().boxed().toList();
        System.out.println("First Input List:"+inputTwo);

        System.out.println("Result: "+inputOne.stream().filter(i->inputTwo.contains(i)).toList());

        //Second Approach Just to demo how to partitionBy Works
        Map<Boolean, List<Integer>> result=inputOne.stream().collect(Collectors.partitioningBy(i-> inputTwo.contains(i)));
        System.out.println("Result: "+result.get(Boolean.TRUE));





    }
}
