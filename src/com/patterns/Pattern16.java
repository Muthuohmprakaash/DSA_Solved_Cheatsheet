package com.patterns;

public class Pattern16 {
    public static void main(String[] args) {
        pattern16(5);
    }
    private static void pattern16(int n){
        char flag = 65;
        for(int i =0;i<n;i++){
            for(int j =0;j<i+1;j++){
                System.out.print(flag);
            }
            flag++;
            System.out.println();
        }
    }
    
}
