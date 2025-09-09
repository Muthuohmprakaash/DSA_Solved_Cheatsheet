package com.string;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }

    private static boolean rotateString(String s, String goal) {
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i + 1, s.length()) + s.substring(j, i + 1);
            if (rotated.equals(goal)) {
                return true;
            }
        }
        return false;

    }

}
