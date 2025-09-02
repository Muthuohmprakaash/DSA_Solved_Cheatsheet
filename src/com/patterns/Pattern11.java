package com.patterns;

public class Pattern11 {
    public static void main(String[] args) {
        pattern11(5);
    }

    private static void pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    System.out.print("1");
                } else if (i % 2 == 0 && j % 2 != 0) {
                    System.out.print("0");
                } else if (i % 2 != 0 && j % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

}
