package org.assignment.functions;

import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the age of voter : ");
        int age = scn.nextInt();
        canVote(age);
    }

    private static void canVote(int age) {
        if (age >= 18) {
            System.out.println("P12" +
                    "erson can vote ");
        } else
            System.out.println("Person is not eligible to vote");
    }
}
