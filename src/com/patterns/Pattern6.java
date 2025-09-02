package com.patterns;

public class Pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }
    public static void pattern6(int n){
        for(int i =0;i<n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
