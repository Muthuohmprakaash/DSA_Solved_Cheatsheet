package com.patterns;

public class Pattern21 {
    public static void main(String[] args) {
        pattern21(2);
    }
    private static void pattern21(int n){
         for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                    if(i==0 || i==n-1 || j==0){
                        System.out.print("*");
                    }else if(j==n-1){
                        for(int k = 0;k<n-2;k++){
                            System.out.print(" ");
                        }
                        System.out.print("*");
                    }                                                                                                                                                            
            }
            System.out.println();
         }
    }
    
}
