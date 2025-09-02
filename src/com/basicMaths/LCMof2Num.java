package com.basicMaths;

public class LCMof2Num {
    public static void main(String[] args) {
        System.out.println(findLCM(4, 6));
    }

    private static int findLCM(int n1, int n2) {
        int i = 1;
        int lcm;
        int n = Math.max(n2, n1);
        while (true) {
            int mul = n * i;
            if (mul % n1 == 0 && mul % n2 == 0) {
                lcm = mul;
                break;
            }
            i++;

        }
        return lcm;

    }

}
