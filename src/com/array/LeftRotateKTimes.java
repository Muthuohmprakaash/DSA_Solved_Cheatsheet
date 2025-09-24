package com.array;

import java.util.Arrays;

public class LeftRotateKTimes {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };

        // System.out.println(Arrays.toString(rotateKtimesBrute(arr, 15)));
        System.out.println(Arrays.toString(optimal(arr, 15)));

    }

    // private static int[] rotateKtimesBrute(int[] nums, int k) {
    // int size = nums.length;
    // int rotation = k % nums.length;
    // int temp[] = new int[rotation];
    // for (int i = 0; i < rotation; i++) {
    // temp[i] = nums[i];
    // }
    // for (int j = 0; j < size - rotation; j++) {
    // nums[j] = nums[rotation + j];
    // }
    // int p = 0;
    // for (int m = size - rotation; m < size; m++) {
    // nums[m] = temp[p];
    // p++;
    // }
    // return nums;

    // }

    private static int[] optimal(int[] nums, int k) {
        // step 1; reverse till K times
        // Step 2: reverse after K
        // step 3: reverse overall array
        int rotation = k % nums.length;
        int size = nums.length;
        reverse(nums, 0, rotation - 1);
        reverse(nums, rotation, size - 1);
        reverse(nums, 0, size - 1);

        return nums;

    }

    private static void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }

    }

}
