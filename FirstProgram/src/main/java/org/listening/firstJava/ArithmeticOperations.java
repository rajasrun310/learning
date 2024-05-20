package org.listening.firstJava;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.print("Enter the first number ");

        double a = number.nextDouble();

        System.out.print("Enter the second number ");

        double b = number.nextDouble();

        System.out.print("Choose and Enter the type of operation you want to perform (+, -, *, /) ");

        char operator = number.next().charAt(0);

        operation(a, b, operator);
    }

    public static double operation(double a, double b, char op) {

        double result = 0;

        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            if (b == 0){
                throw new ArithmeticException("The remainder cannot be 0");
            }
            result = a / b;
        }
        System.out.println("Your answer is : " + result);
        return result;
    }
}
