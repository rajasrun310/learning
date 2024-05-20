package org.assignment.functions;

import java.util.Scanner;

public class CircumferenceAndArea {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int radius = scn.nextInt();
        circumferenceAndArea(radius);
    }

    /**
     * For circumference the formula is 2*pi*radius
     * FOr area  it is pi * radius square
     * @param radius provided by the user
     */
    private static void circumferenceAndArea(int radius) {
        double circumference = 2 * 3.14 * radius;
        System.out.printf("\nThe circumference of a circle for given radius is %.2f " , circumference);

        double area  = 3.14 * radius * radius;
        System.out.printf("The area of a circle for given radius is: %.2f" , area);
    }
}
