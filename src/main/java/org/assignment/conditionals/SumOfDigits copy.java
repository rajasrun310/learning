package org.assignment.conditionals;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter an number : ");
        int num = scn.nextInt();
        int result = 0;

        while(num >=1){
            result = result  +  num % 10;
            num = num/10;
        }
        System.out.println(result);
    }
}
