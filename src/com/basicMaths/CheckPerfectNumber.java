package com.basicMaths;

public class CheckPerfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNum(28));
    }
    private static boolean checkPerfectNum(int n){
        int checkVar = 0;
        for(int i =1;i<n;i++){
            if(n%i == 0){
                checkVar = checkVar + i;
            }
        }
        if(checkVar == n){
            return true;
        }
        return false;
    }
    
}
