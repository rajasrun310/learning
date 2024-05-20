package org.assignment.functions;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int marks = scn.nextInt();
        if (marks > 100 || marks < 0) {
            System.out.println("invalid marks");
        } else {
            getGrade(marks);
        }
    }

    /**
     * Calculating the grades for the marks provided by the user
     * @param marks integer
     */
    private static void getGrade(int marks) {
        switch (marks / 10) {
            case 10:
            case 9:
                System.out.println("The grade is : AA");
                break;
            case 8:
                System.out.println("The grade is : AB");
                break;
            case 7:
                System.out.println("The grade is : BB");
                break;
            case 6:
                System.out.println("The grade is : BC");
                break;
            case 5:
                System.out.println("The grade is : CD");
                break;
            case 4:
                System.out.println("The grade is : DD");
                break;
            default:
                System.out.println("Fail");
                break;
        }
    }
}
