package com.array;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 8, 8, 7, 6, 5 };
        System.out.println(secondLargest(arr));
    }

    private static int secondLargest(int[] nums) {
        Arrays.sort(nums);
        int largest = nums[nums.length - 1];
        int sec = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < largest) {
                sec = nums[i];
                break;
            }
        }
        return sec;

    }

}
