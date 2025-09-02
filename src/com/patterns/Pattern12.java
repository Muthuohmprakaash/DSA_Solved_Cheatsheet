package com.patterns;

public class Pattern12 {
    public static void main(String[] args) {
        pattern12(5);
    }

    private static void pattern12(int n) {
        int flag = n * 2 - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            for (int k = 0; k < flag; k++) {
                System.out.print(" ");
            }
            flag = flag - 2;
            int count = i;
            for (int l = 1; l < i + 1; l++) {
                System.out.print(count);
                count--;
            }

            System.out.println();
        }
    }

}
