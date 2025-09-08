package com.string;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("malayalam"));
    }

    private static boolean checkPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
