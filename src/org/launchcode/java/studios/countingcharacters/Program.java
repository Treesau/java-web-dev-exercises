package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Program {

    public static void main(String[] args) {
        HashMap<Character, Integer> characters = new HashMap<>();
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.next().toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        for (int i = 0; i < str.length(); i++) {
            char char1 = str.charAt(i);
            if (characters.containsKey(char1)) {
                characters.put(char1, characters.get(char1) + 1);
            } else {
                characters.put(char1, 1);
            }
        }
        for (Map.Entry<Character, Integer> ch : characters.entrySet()) {
            System.out.println(ch.getKey() + ": " + ch.getValue());
        }
    }
}
