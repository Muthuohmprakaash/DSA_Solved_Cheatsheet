package com.patterns;

public class Pattern17 {
    public static void main(String[] args) {
        pattern17(4);
        pattern17striverIntution(4);
    }

    private static void pattern17(int n) {
        char flag = 65;
        int count = n - 1;
        int increment = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(" ");
            }
            count--;
            for (int k = 0; k < increment; k++) {
                if (k >= i) {
                    flag--;
                    flag--;
                    for (int l = i; l < increment; l++) {
                        System.out.print(flag);
                        flag--;
                    }
                    break;
                } else {
                    System.out.print(flag);
                    flag++;
                }

            }
            flag = 65;
            increment = increment + 2;

            System.out.println();
        }
    }
    private static void pattern17striverIntution(int n) {
        
        for(int i=1;i<=n;i++){
            char alpha='A';
            for(int l=1;l<=(n-i);l++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(alpha);
                if(j<i){
                    alpha++;
                }else{
                    alpha--;
                }
            }
            
            System.out.println();
        }
    }

}
