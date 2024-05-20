package org.assignment.conditionals;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scn.nextLine();
        boolean result = true;
        int length = str.length();
        for (int i = length - 1, j = 0; j < i; i--, j++) {
            if (str.charAt(i) != str.charAt(j)) {
                result = false;
            }

        }
        if (result) {
            System.out.println("the String is palindrome");
        } else {
            System.out.println("it is not palindrome");
        }

    }

}
