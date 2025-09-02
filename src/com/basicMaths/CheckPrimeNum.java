package com.basicMaths;

public class CheckPrimeNum {
    public static void main(String[] args) {
        System.out.println(checkPrimeNum(8));
    }
    private static boolean checkPrimeNum(int n){
        if(n==1){
            return true;
        }
        for(int i =2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
    
}
