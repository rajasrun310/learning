package org.Arrarys;

import java.util.Arrays;

public class ReturningSumOf1DArray {

    public static int[] sumOfArray(int[] nums){
/*        int [] result = new int[num.length];
        result[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            result[i] = result[i-1] + num[i];
        }
        return result;*/
        for(int i =1; i<nums.length; i++){
            nums[i] = nums[i]+nums[i-1];

        }
        return nums;
    }

    public static void main(String[] args) {
        int[] num = {1,2,4,5,6,7,8};
        System.out.println(Arrays.toString(sumOfArray(num)));
    }
}


