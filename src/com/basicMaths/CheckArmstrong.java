package com.basicMaths;

public class CheckArmstrong {
    public static void main(String[] args) {
        System.out.println(checkArmstrong(408));
    }

    private static boolean checkArmstrong(int n) {
        if (n == 0) {
            return false;
        }
        int temp = n;
        int count = 0;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        int check = 0;
        int temp2 = n;
        while (temp2 > 0) {
            check = check + (int) Math.pow(temp2 % 10, count);
            temp2 = temp2 / 10;
        }
        if (check == n) {
            return true;
        }
        return false;
    }
}
