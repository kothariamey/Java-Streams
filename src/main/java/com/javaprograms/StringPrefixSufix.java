package com.javaprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//List of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
public class StringPrefixSufix {
    public static List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

    public static void main(String[] args) {
        listOfStrings.stream().collect(Collectors.joining());
    }

}
