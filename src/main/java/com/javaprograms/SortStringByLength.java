package com.javaprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Given a list of strings, sort them according to increasing order of their length?
public class SortStringByLength {

    public static void main(String[] args) {

        List<String> input = Arrays.asList("Mary", "Had","a","Little","Lamb");

        //Ascending
        input.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        //Descending
        input.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

    }


}
