package com.basicMaths;

public class CountPrimeNumTillN {
    public static void main(String[] args) {
        System.out.println(countPrime(20));
        System.out.println(countPrimeStriverApproach(20));
    }

    private static int countPrime(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && j != i) {
                    break;
                } else if (j % i == 0 && j == i) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int countPrimeStriverApproach(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (checkPrimeNum(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean checkPrimeNum(int n) {
        if (n == 1) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

}
