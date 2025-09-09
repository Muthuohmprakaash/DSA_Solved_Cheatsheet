package com.string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = { "flowers", "flow", "fly", "flight" };
        System.out.println(findLongestPrefix(arr));
    }

    private static String findLongestPrefix(String[] s) {
        String ans = "";

        for (int i = 0; i < s[0].length(); i++) {

            char c = s[0].charAt(i);

            for (int j = 1; j < s.length; j++) {

                if (i >= s[j].length() || s[j].charAt(i) != c) {
                    return ans;
                }
            }

            ans += c;

        }
        return ans;

    }

}
