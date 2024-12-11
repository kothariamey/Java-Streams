package com.javaprograms;

import java.util.List;
import java.util.Random;

public class MinAndMax {
    //Given a list of integers, find maximum and minimum of those numbers?
    public static void main(String[] args) {
        List<Integer> random=new Random().ints(10, 100,200).boxed().toList();

        System.out.println("Min: "+random.stream().min(Integer::compare).get());
        System.out.println("Max: "+random.stream().max(Integer::compare).get());

    }
}
