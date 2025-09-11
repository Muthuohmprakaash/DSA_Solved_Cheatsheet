package com.basicRecursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }

    private static long findFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * findFactorial(n - 1);

    }

}
