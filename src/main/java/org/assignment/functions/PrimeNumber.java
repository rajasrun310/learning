package org.assignment.functions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int firstNum = scn.nextInt();
        System.out.print("Enter Second number : ");
        int secondNum = scn.nextInt();
        System.out.printf("\nThe prime numbers between %d and %d are : ", firstNum, secondNum);
        for (int i = firstNum; i <= secondNum; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }
        // 2 is a prime number
        if (number == 2) {
            return true;
        }
        int c = 2;
        while (c * c <= number) {
            if (number % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > number;
    }
}


