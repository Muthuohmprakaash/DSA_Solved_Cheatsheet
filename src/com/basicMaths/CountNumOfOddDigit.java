package com.basicMaths;

public class CountNumOfOddDigit {
    public static void main(String[] args) {
        System.out.println(countOddDigit(3432));
    }

    private static int countOddDigit(int n) {
        int updateVal = n;
        int count = 0;
        while (updateVal > 0) {
            if ((updateVal % 10) % 2 != 0) {
                count++;

            }
            updateVal = updateVal / 10;

        }
        return count;
    }

}
