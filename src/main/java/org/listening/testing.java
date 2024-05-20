package org.listening;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class testing {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String countStr = scn.nextLine();
        var result = charCount(countStr);
        System.out.println(result);
    }

    private static Map<Character, Integer> charCount(String countStr) {
        char[] count = countStr.toCharArray();
        Map<Character, Integer> result = new HashMap<>();

        for (char c : count) {
            if(result.containsKey(c)){
                result.put(c, result.get(c)+1);
            }
            else {
                result.put(c,1);
            }
        }
        return  result;
    }

}
