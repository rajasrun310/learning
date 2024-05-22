package org.Arrarys;

import java.util.Arrays;

public class BuildArrayPermutation {

    public static int[] build(int[] num) {

        //Building an array of same length as num
        int arr[] = new int[num.length];

        // iterating trough num array
        for (int i = 0; i < num.length; i++) {

            arr[i] = num[num[i]];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] temp = {0, 1, 3, 5, 4, 7, 6, 8, 2};
        System.out.println(Arrays.toString(build(temp)));
    }
}
