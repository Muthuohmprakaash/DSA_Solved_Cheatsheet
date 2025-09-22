package com.basicRecursion;

public class Fibanocci {
    public static void main(String[] args) {
        System.out.println(findTheFibanocci(4));
        System.out.println(usingForloop(4));
    }

    private static int findTheFibanocci(int n) {
        if (n <= 1) {
            return n;
        }
        return findTheFibanocci(n - 1) + findTheFibanocci(n - 2);
    }

    private static int usingForloop(int n) {
        int count = 0;
        int one = 1;
        int sec = 0;
        if (n <= 1) {
            return n;
        }
        for (int i = 2; i <= n; i++) {
            count = one + sec;
            sec = one;
            one = count;
        }
        return count;
    }

}
