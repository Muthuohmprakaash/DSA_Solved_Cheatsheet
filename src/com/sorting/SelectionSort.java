package com.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = { 7, 4, 1, 5, 3 };
        System.out.println(Arrays.toString(selectionSort(nums)));
    }

    private static int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minOfArray = findMinimumIntheArray(nums, i);
            int temp = nums[i];
            nums[i] = nums[minOfArray];
            nums[minOfArray] = temp;
        }
        return nums;
    }

    private static int findMinimumIntheArray(int[] arr, int i) {
        int min = Integer.MAX_VALUE;

        int index = 0;
        while (i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
            i++;
        }
        return index;
    }
}
