package org.listening.firstJava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the principal amount ");
        float principal = scn.nextFloat();

        System.out.print("Enter the time ");

        float time = scn.nextFloat();

        System.out.print("Enter the rate ");

        float rate = scn.nextFloat();

        float si = (principal * time * rate) / 100;
        System.out.println("the simple interest is :" + si);

        float actualAmount = principal + si;

        System.out.println("The actual amount is " + actualAmount);

        scn.close();

    }
}
