package com.basicMaths;

import java.util.Arrays;

public class DivisorOfNum {
    public static void main(String[] args) {
        int ans[] = findAllDivisor(6);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] findAllDivisor(int n) {
        int arr[] = new int[n];
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[j] = i;
                j++;
            }
        }
        int[] ans = Arrays.copyOf(arr, j);
        return ans;
    }

}
