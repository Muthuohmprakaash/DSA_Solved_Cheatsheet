package com.patterns;

public class Pattern10 {
    public static void main(String[] args) {
        pattern10(5);
    }

    private static void pattern10(int n) {
        int flag = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 0; k < n - 1; k++) {
            for (int l = 0; l < flag; l++) {
                System.out.print("*");
            }
            flag--;
            System.out.println();
        }
    }

}
