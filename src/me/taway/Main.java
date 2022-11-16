package me.taway;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Get words:
        System.out.println("Words, one by one split by a space.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        // Perform cock magic:
        String[] dictionary = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int i = 0;
        for (String word : words) {
            // convert word to char array:
            char[] chars = word.toCharArray();
            // convert char array to string array:
            String[] stringChars = new String[chars.length];
            for (int j = 0; j < chars.length; j++) {
                stringChars[j] = String.valueOf(chars[j]);
            }
            String numberWord = "";
            // compare to dictionary:
            for (String stringChar : stringChars) {
                for (int j = 0; j < dictionary.length; j++) {
                    char[] dictionaryChars = dictionary[j].toCharArray();
                    for (char dictionaryChar : dictionaryChars) {
                        if (String.valueOf(dictionaryChar).equals(stringChar)) {
                            numberWord += j;
                        }
                    }
                }
            }
            // Print new word:
            System.out.println(String.format("%d:%s - %s", i, word, numberWord));
            i++;
        }
    }
}
