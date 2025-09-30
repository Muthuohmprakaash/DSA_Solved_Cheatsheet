package com.array;

public class FindMissingNum {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4 };
        System.out.println(findNum(arr));
    }

    private static int findNum(int[] nums) {

        int[] hash = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }
        for (int j = 0; j < hash.length; j++) {
            if (hash[j] == 0) {
                return j;
            }
        }
        return 0;
    }
}
