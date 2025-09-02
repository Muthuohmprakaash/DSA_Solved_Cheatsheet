package com.patterns;

public class Pattern20 {
     public static void main(String[] args) {
        join1pattern20(2);
        join2pattern20(2);
    }
    private static void join1pattern20(int n){
       int flag = 2*n-2;
        for(int i =0;i<n-1;i++){
            for(int j =0;j<i+1;j++){
                System.out.print("*");
            }
            for(int p =0;p<flag;p++){
                System.out.print(" ");
            }
            flag = flag -2;
            for(int k =0;k<i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
     private static void join2pattern20(int n){
        int flag = 1;
        for(int i =0;i<n;i++){
            for(int j =0;j<n-i;j++){
                System.out.print("*");
            }
            for(int p =1;p<flag;p++){
                System.out.print(" ");
            }
            flag = flag +2;
             for(int k = 0;k<n-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
  
}
