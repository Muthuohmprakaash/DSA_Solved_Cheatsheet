package com.basicRecursion;

public class SumofArrayElements {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        System.out.println(arraySum(arr));
    }

    private static int arraySum(int[] nums) {

        return sum(nums, 0, 0);
    }

    private static int sum(int[] nums, int num, int ans) {
        if (num >= nums.length) {
            return 0;
        }

        ans = sum(nums, num + 1, ans);
        // ans = ans + nums[num];
        return ans + nums[num];
    }

}
