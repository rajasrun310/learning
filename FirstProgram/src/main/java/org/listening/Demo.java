package org.listening;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rollNo = input.nextInt();
        System.out.println("Your roll no is: " + rollNo);
        byte a = 40;
        byte b = 50;
        int c =  (a*b);


        System.out.println(c);

        int sal = 10000;
        if(sal >= 10000)
        {sal = sal+ 200;
        }else{
            sal = sal +500;

        }
    }
}
