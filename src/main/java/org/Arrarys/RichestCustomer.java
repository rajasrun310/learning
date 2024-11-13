package org.Arrarys;

public class RichestCustomer {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {2, 4, 5, 7},
                {9, 7, 6}
        };
        richest(arr);
    }

    private static void richest(int[][] arr) {
        int ans = 0;
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum = sum + arr[row][col];
            }
            System.out.println(sum);
            if (sum > ans) {
                ans = sum;
            }
        }
        System.out.println(ans);
    }
}
