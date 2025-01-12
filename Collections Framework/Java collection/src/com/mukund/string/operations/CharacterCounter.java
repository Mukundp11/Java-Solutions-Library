package com.mukund.string.operations;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> occurrences = countCharacters(input);

        System.out.println("Character occurrences:");
        occurrences.forEach((key, value) -> System.out.println("'" + key + "' : " + value));
    }

    public static Map<Character, Integer> countCharacters(String input) {
        Map<Character, Integer> occurrences = new LinkedHashMap<>();
        for (char ch : input.toCharArray()) {
            occurrences.put(ch, occurrences.getOrDefault(ch, 0) + 1);
        }
        return occurrences;
    }
}