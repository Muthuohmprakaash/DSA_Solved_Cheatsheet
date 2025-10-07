package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersinArray {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 0, 0 };
        System.out.println(findLeadersBrute(arr));
        System.out.println(findLeadersOptimal(arr));
    }

    private static List<Integer> findLeadersBrute(int[] nums) {

        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] <= nums[j]) {
                    break;
                } else if (j == nums.length - 1) {
                    ls.add(nums[i]);
                }
            }
        }
        ls.add(nums[nums.length - 1]);
        return ls;
    }

    private static List<Integer> findLeadersOptimal(int[] nums) {

        ArrayList<Integer> ls = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (max < nums[i]) {
                max = nums[i];
                ls.add(nums[i]);
            }
        }
        Collections.reverse(ls);
        return ls;
    }

}
