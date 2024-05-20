package org.listening;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TotalCountOfCharInString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert string to character array
        char[] charArray = str.toCharArray();

        for(char c : charArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If the character is not present, add it to the map with count as 1
                charCountMap.put(c, 1);
            }
        }

        // Print the character count map
        System.out.println("Character counts:");
        for (char c : charCountMap.keySet()) {
                System.out.println("'" + c + "' : " + charCountMap.get(c));
        }

    }
}
