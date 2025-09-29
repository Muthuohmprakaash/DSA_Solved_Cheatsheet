package com.array;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = { 0, -20, 20, 0, 4, 0, 7, 10, 0 };
        System.out.println(Arrays.toString(moveZero(arr)));
        System.out.println(Arrays.toString(moveZerosTwoPointerApproach(arr)));
    }

    private static int[] moveZero(int[] nums) {
        int[] temp = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp[j] = nums[i];
                j++;
            }
        }
        for (int k = 0; k < temp.length; k++) {
            nums[k] = temp[k];
        }
        return temp;
    }

    private static int[] moveZerosTwoPointerApproach(int[] nums) {

        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[i] == 0 && nums[j] == 0) {
                j++;
            } else if (nums[i] == 0 && nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            } else {
                i++;
                j++;
            }
        }

        return nums;

    }

}
