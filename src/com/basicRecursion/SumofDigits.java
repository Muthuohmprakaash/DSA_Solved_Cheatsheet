package com.basicRecursion;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(findSum(529));
    }

    private static int findSum(int num) {

        int ans = findSumofDigits(num, 0);
        while (ans > 9) {
            ans = findSumofDigits(ans, 0);
        }
        return ans;

    }

    private static int findSumofDigits(int num, int ans) {
        if (num <= 0) {
            return ans;
        }
        ans = ans + num % 10;
        num = num / 10;
        return findSumofDigits(num, ans);
    }

}
