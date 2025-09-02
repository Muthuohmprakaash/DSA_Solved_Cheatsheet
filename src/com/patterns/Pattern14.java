package com.patterns;

public class Pattern14 {
    public static void main(String[] args) {
        pattern14(5);
    }

    private static void pattern14(int n) {
        char flag = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(flag);
                flag++;
            }
            flag = 65;
            System.out.println();
        }
    }
}
