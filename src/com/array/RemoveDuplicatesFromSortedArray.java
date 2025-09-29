package com.array;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = { -2, 2, 4, 4, 4, 4, 5, 5 };
        System.out.println(removeDuplicates(arr));
    }

    private static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int count = 0;

        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                count++;
                i++;
                nums[i] = nums[j];
                j++;
            } else {
                nums[i] = nums[j];
                j++;
            }
        }
        if (i < nums.length) {

            count++;
        }

        return count;
    }

}
