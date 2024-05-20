package org.listening.firstJava;

import java.util.Scanner;

public class CountNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int number = scn.nextInt();
        int count = 0;

        while (number > 0) {
            int remainder = number % 10;
            if (remainder == 5) {
                count++;
            }
            number = number / 10;
        }
        System.out.println(count);

    }
}
