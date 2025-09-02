package com.basicMaths;

public class ReturnLargestDigit {
    public static void main(String[] args) {
        System.out.println(findLargestDigit(25));
    }

    private static int findLargestDigit(int n) {
        if (n == 0) {
            return 0;
        }
        int largestNum = 0;
        while (n > 0) {
            if (n % 10 > largestNum) {
                largestNum = n % 10;
            }
            n = n / 10;
        }
        return largestNum;

    }

}
