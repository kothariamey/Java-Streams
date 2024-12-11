package com.javaprograms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfAStatement {

    public static void main(String[] args) {
        String input = "Mary had a Little lamb";

        String reversedString = Arrays.stream(input.split(" "))
                .map(i-> i.trim())
                .map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));

        System.out.println(reversedString);

    }
}
