package com.sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 7, 4, 1, 5, 3 };
        System.out.println(Arrays.toString(quickSort(arr)));
    }

    private static int[] quickSort(int[] nums) {

        sort(nums, 0, nums.length - 1);
        return nums;
    }

    private static int[] sort(int[] nums, int low, int high) {

        if (low < high) {
            int partition = findThePartionPoint(nums, low, high);
            sort(nums, low, partition - 1);
            sort(nums, partition + 1, high);
        }
        return nums;
    }

    private static int findThePartionPoint(int[] nums, int low, int high) {
        int left = low;
        int right = high;
        int pivot = nums[left];
        while (left < right) {
            while (nums[left] <= pivot && left <= right - 1) {
                left++;
            }
            while (nums[right] > pivot && right >= low + 1) {
                right--;
            }
            if (left < right) {
                int temp1 = nums[left];
                nums[left] = nums[right];
                nums[right] = temp1;
            }
        }
        int temp2 = nums[low];
        nums[low] = nums[right];
        nums[right] = temp2;

        return right;

    }

}
