package org.listening.firstJava;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scn.nextInt();
        int result = 0;

        while (number > 0) {
            int remainder = number % 10;
            number /= 10;

            result = (result * 10) + remainder;

        }
        System.out.println(result);
    }
}
