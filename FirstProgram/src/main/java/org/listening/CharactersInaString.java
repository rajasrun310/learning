package org.listening;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharactersInaString {
    public static void main(String[] args) {
/*        System.out.println("Enter a String");
        Scanner scanner = new Scanner(System.in);
        String countStr = scanner.nextLine();
        System.out.println(charCount(countStr));*/
        int[] arr = {4, 3, 2, 5, 6, 0, 1};
        int[] ar = buildArray(arr);
        System.out.println(Arrays.toString(ar));
    }

    private static Map<Character, Integer> charCount(String countStr) {

        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] charArray = countStr.toCharArray();
        for (char ch : charArray) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }
        return charCountMap;
    }

    public static int[] buildArray(int[] nums) {
        int[] arr = new int[2 * nums.length];
        for(int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[i + nums.length] = nums[i];
        }
        return arr;
    }

}
