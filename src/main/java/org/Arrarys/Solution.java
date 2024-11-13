package org.Arrarys;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int [] nums = {1,5,4,6,9,3};
        int[] index = {0,1,2,3,3,4};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] target = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}

