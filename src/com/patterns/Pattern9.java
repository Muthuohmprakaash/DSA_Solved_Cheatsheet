package com.patterns;

public class Pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }

    public static void pattern9(int n) {
        int flag = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < n - i - 1; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
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
