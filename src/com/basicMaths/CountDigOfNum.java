package com.basicMaths;

public class CountDigOfNum {
    public static void main(String[] args) {
        int n = 14222;
        System.out.println(findCount(n));
    }

    private static int findCount(int n) {
        String convert = Integer.toString(n);
        int count = 0;
        for (int i = 0; i < convert.length(); i++) {
            count++;
        }
        return count;
    }

    public int countDigitStriverApproach(int n) {
        // Edge case
        if (n == 0)
            return 1;

        // Set counter to 0
        int cnt = 0;

        // Iterate until n is greater than zero
        while (n > 0) {
            // Increment count of digits
            cnt = cnt + 1;
            n = n / 10;
        }

        return cnt;
    }

}
