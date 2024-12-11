package com.javaprograms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ValidateAnagrams {
    //Java 8 program to check if two strings are anagrams or not?
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";

        if(s1.length()==s2.length()) {
            if(Arrays.stream(s1.split("")).sorted().collect(Collectors.joining()).equals(Arrays.stream(s2.split("")).sorted().collect(Collectors.joining())))
            {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        }

    }
}
