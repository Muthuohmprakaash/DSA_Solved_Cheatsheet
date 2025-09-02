package com.patterns;

public class Pattern7 {
    public static void main(String[] args) {
        pattern7(4);
    }
    public static void pattern7(int n){
        for(int i =0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            } for(int k = 0; k<i*2+1;k++){
                System.out.print("*");
            } for(int l = 0;l<n-i-1;l++){
                System.out.print(" ");
            }
            System.out.println();    
        }
    }
}
