package org.listening.firstJava;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter an number :");
        int number = scn.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
        scn.close();

    }
}
