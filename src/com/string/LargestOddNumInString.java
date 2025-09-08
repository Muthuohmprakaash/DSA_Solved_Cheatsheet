package com.string;

public class LargestOddNumInString {
    public static void main(String[] args) {
        System.out.println(findLargestOdd("23450000000000000001"));
    }

    private static String findLargestOdd(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                count++;
            } else {
                break;
            }
        }

        int num = s.length() - 1;
        while (num >= count) {
            if (s.charAt(num) % 2 != 0) {
                return s.substring(count, num + 1);
            }
            num--;
        }
        return "";
    }
}
