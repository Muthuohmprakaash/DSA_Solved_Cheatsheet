package com.array;

import java.util.Arrays;

public class RearrangeArrBySign {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, -1, -3, -4};

        System.out.println(Arrays.toString(rearrange(arr)));
        System.out.println(Arrays.toString(rearrangeOptimal(arr)));

    }

    private static int[] rearrange(int[] nums) {

        int[] ans = new int[nums.length];

        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2];
        int p = 0;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos[p] = nums[i];
                p++;
            } else {
                neg[n] = nums[i];
                n++;
            }
        }
        int x = 0;
        int y = 0;
        for (int j = 0; j < ans.length; j = j + 2) {
            ans[j] = pos[x];
            x++;
        }
        for (int z = 1; z < ans.length; z = z + 2) {
            ans[z] = neg[y];
            y++;
        }

        return ans;

    }

    private static int[] rearrangeOptimal(int[] nums) {
        int[] ans = new int[nums.length];

        int i = 0;
        int j = 1;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] > 0) {
                ans[i] = nums[k];
                i = i + 2;
            } else {
                ans[j] = nums[k];
                j = j + 2;
            }
        }

        return ans;

    }

}
