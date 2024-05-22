package org.Arrarys;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] num) {

        int[] result = new int[2 * num.length];
        for (int i = 0; i < num.length; i++) {
            result[i] = num[i];
            result[i + num.length] = num[i];
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 4, 3};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
}
