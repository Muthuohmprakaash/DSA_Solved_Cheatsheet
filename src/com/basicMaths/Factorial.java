package com.basicMaths;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }

    private static int findFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }

}
