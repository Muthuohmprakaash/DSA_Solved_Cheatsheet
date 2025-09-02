package com.patterns;

public class Pattern18 {
    public static void main(String[] args) {
        pattern18(5);
    }

    private static void pattern18(int n) {

        char alpha = (char) ('A' + n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if(j==0){
                alpha = (char) ('A' + n - i);
                System.out.print(alpha);
                
                }else{
                    alpha++;
                    System.out.print(alpha);
                }
            }
            
            System.out.println();
        }
    }
}
