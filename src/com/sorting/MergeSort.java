package com.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 7, 9, 3, 1, 4, 7, 1 };
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    private static int[] mergeSort(int[] nums) {

        divide(nums, 0, nums.length - 1);
        return nums;
    }

    private static void divide(int[] nums, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2;
        divide(nums, left, mid);
        divide(nums, mid + 1, right);
        merge(nums, left, mid + 1, right);

    }

    private static void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[nums.length];
        int i = left;
        int low = left;
        int high = mid;
        while (low < mid && high <= right) {
            if (nums[low] >= nums[high]) {
                temp[i] = nums[high];
                high++;
                i++;

            } else {
                temp[i] = nums[low];
                low++;
                i++;
            }
        }
        while (low < mid) {
            temp[i] = nums[low];
            low++;
            i++;
        }
        while (high <= right) {
            temp[i] = nums[high];
            high++;
            i++;
        }

        for (int k = left; k <= right; k++) {
            nums[k] = temp[k];
        }
    }

}
