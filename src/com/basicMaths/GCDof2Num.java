package com.basicMaths;

public class GCDof2Num {
    public static void main(String[] args) {
        System.out.println(findGCD(9, 8));
    }

    private static int findGCD(int n1, int n2) {
        int largest = 1;
        for (int i = 2; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                largest = i;
            }
        }
        return largest;

    }

}
