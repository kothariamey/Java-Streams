package com.javaprograms;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeperateOddEvenIntegers {

    public static void main(String[] args) {
        implement();
    }

    //Given a list of integers, separate odd and even numbers
    public static void implement(){
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        Map<Boolean, List<Integer>> oddEvenIntergerMap=listOfIntegers.stream().collect(Collectors.partitioningBy(i-> i % 2 == 0));

        oddEvenIntergerMap.entrySet().stream().filter(i->i.getKey()).forEach(System.out::println);
        oddEvenIntergerMap.entrySet().stream().filter(i->!i.getKey()).forEach(System.out::println);
    }

}

