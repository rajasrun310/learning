package org.listening.firstJava;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a name");

        String name = scn.next();

        System.out.println("Hi " + name + " Good Morning");
        scn.close();
    }
}
