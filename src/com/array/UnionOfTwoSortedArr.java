package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSortedArr {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 2, 3, 4, 5, 5 };
        int arr2[] = { 3, 4, 4, 7 };
        System.out.println(Arrays.toString(bruteunionArr(arr1, arr2)));

    }

    private static int[] bruteunionArr(int[] nums1, int[] nums2) {
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            st.add(nums1[i]);
        }
        for (int j = 0; j < nums2.length; j++) {
            st.add(nums2[j]);
        }
        int k = 0;
        int[] ans = new int[st.size()];
        for (int x : st) {
            ans[k++] = x;

        }
        return ans;
    }

}
