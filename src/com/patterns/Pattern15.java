package com.patterns;

public class Pattern15 {
    public static void main(String[] args) {
        pattern15(5);
    }
    private static void pattern15(int n){
        char flag = 65;
        for(int i =0;i<n;i++){
            for(int j = 0;j<n-i;j++){
                System.out.print(flag);
                flag++;
            }
            flag = 65;
            System.out.println();
        }
    }    
}
