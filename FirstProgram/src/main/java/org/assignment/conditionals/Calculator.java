package org.assignment.conditionals;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("Enter an operator : ");
            char operator = sc.next().trim().charAt(0);
            int result = 0;
            if (operator == '+' || operator == '-' || operator == '/' || operator == '*' || operator == '%') {

                System.out.print("Enter two numbers : ");
                int firstNumber = sc.nextInt();
                int secondNumber = sc.nextInt();

                if (operator == '+') {
                    result = firstNumber + secondNumber;
                }

                if (operator == '-') {
                    result = firstNumber - secondNumber;
                }

                if (operator == '*') {
                    result = firstNumber * secondNumber;
                }

                if (operator == '/') {
                    if (secondNumber == 0) {
                        System.out.println("Remainder cannot be zero");
                    } else {
                        result = firstNumber / secondNumber;
                    }
                }

                if (operator == '%') {
                    result = firstNumber % secondNumber;
                }

            } else if (operator == 'x' || operator == 'X') {
                break;
            } else {
                System.out.println("Enter an valid operator");

            }
            System.out.println(result);

        }

    }
}
