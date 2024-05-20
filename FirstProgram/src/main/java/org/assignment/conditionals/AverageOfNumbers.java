package org.assignment.conditionals;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter how many numbers avg : ");
        int totalNumbers = scn.nextInt();
        float result = 0;
        for (int i = 0; i < totalNumbers; i++) {
            int numbers = scn.nextInt();
            result = result + numbers;
        }
        result = result / totalNumbers;
        System.out.println(result);
/*        float total = 0 , count = 1;
        float avg;
        while (count <= totalNumbers){
        System.out.print("Enter numbers : " );
        int numbers = scn.nextInt();
        total = total + numbers;
        count ++;
        }
        avg = total/totalNumbers;
        System.out.println("the avg is " + avg);*/
    }
}
