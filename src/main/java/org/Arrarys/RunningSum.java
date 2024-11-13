package org.Arrarys;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println((runningSum(arr)));
    }
        public static int runningSum(int[] nums) {
        int num = 0;
        for(int j :nums){
            num += j;
        }
            return num;
        }
}
