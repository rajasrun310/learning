package org.assignment.conditionals;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter no of units : " );
        int units = scn.nextInt();
        double result = 0;

        if (units <= 100) {
            result = units * 1.20;
        } else if (units <= 300) {
            result = (100 * 1.20) + (units - 100) * 2;
        } else {
            result = (100 * 1.20) + (200 * 2) + (units - 300) * 3;
        }
        System.out.println(result);
    }

}
