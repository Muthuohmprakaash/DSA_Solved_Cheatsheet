package com.basicRecursion;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(palindromeCheck("malayalam"));
    }

    public static boolean palindromeCheck(String s) {
        int i = 0;
        int j = s.length() - 1;

        return findPal(s, i, j);
    }

    private static boolean findPal(String s, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }
        return findPal(s, i + 1, j - 1);

    }
}
