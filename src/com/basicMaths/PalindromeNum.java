package com.basicMaths;

public class PalindromeNum {
    public static void main(String[] args) {
        System.out.println(checkPalidrome(1211));
    }

    private static boolean checkPalidrome(int n) {
        int rev = reversenum(n);
        if (n == rev) {
            return true;
        }
        return false;
    }

    private static int reversenum(int n) {
        String res = "";
        while (n > 0) {
            res = res + n % 10;
            n = n / 10;
        }
        int result = Integer.parseInt(res);
        return result;

    }

}
