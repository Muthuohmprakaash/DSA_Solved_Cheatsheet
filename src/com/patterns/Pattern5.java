package com.patterns;

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);

    }
    public static void pattern5(int n){
        for(int i =0;i<n;i++){
            for(int j = 0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
