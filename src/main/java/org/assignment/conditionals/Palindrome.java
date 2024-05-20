package org.assignment.conditionals;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int number = scanner.nextInt();
        int temp = number;
        int result = 0;
        while (number > 0) {
            result = result * 10 + number % 10;
            number = number / 10;
        }
        if (temp == result) {
            System.out.println("it is palindrome");
        }
    }
}
