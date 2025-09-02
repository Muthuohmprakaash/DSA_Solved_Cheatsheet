package com.patterns;

public class Pattern8 {
    public static void main(String[] args) {
        pattern8(4);
    }

    public static void pattern8(int n) {
        int flag = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * n - flag; k++) {
                System.out.print("*");

            }
            flag = flag + 2;
            System.out.println();

        }
    }

}
