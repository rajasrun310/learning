package org.assignment.conditionals;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
/*        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the price : ");
        float price = scn.nextFloat();
        System.out.print("Enter the discount Percentage : ");
        float discountPercentage = scn.nextFloat();

        float discount = (price * discountPercentage)/100;
        System.out.println("the discount is : " + discount );*/
        sum();

    }

    public static void sum(){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String ans = "";
        int a = s.length();

        for (int i = a - 1  ; i >= 0; i--) {

            char c = s.charAt(i);
             ans = ans + c;
        }
    }
}
