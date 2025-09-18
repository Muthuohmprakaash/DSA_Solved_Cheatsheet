package com.basicRecursion;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(checkPrime(24));
    }

    private static boolean checkPrime(int n) {
        int i = 2;
        if (n == 0 || n == 1) {
            return false;
        }
        return findPrime(n, i);
    }

    private static boolean findPrime(int n, int i) {

        if (i >= n) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return findPrime(n, i + 1);
    }

}
