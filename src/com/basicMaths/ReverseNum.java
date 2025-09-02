package com.basicMaths;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println(reversenum(53));
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
