package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionoftwosortedArr {
    public static void main(String[] args) {
        int[] num1 = { 1, 2, 2, 3, 3, 3 };
        int[] num2 = { 2, 3, 3, 4, 5, 7 };

        System.out.println(Arrays.toString(mergedNumbers(num1, num2)));
    }

    private static int[] mergedNumbers(int[] num1, int[] num2) {
        List<Integer> ls = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < num1.length && j < num2.length) {
            if (num1[i] == num2[j]) {
                ls.add(num1[i]);
                i++;
                j++;
            } else if (num1[i] < num2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] ans = new int[ls.size()];
        int k = 0;
        for (int x : ls) {
            ans[k++] = x;
        }
        return ans;

    }

}
