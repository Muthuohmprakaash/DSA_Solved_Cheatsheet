package com.patterns;

public class Pattern13 {
    public static void main(String[] args) {
        pattern13(5);
   }
   private static void pattern13(int n){
    int flag = 1;
    for(int i =1;i<=n;i++){
        for(int j = 1;j<i+1;j++){
            System.out.print(flag);
            flag++;
        }
        System.out.println();
        
    }
   } 
}
