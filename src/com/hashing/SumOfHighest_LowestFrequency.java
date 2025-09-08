package com.hashing;

public class SumOfHighest_LowestFrequency {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 3 };
        System.out.println(findSumOfHighAndLow(arr));
    }

    private static int findSumOfHighAndLow(int[] arr) {
        if (arr.length == 1) {
            return arr[0] + arr[0];
        }
        int hash[] = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        int high = 0;
        int low = Integer.MAX_VALUE;

        for (int j = 0; j < hash.length; j++) {

            if (hash[j] > 0 && hash[j] < low) {
                low = hash[j];
            }
            if (hash[j] > high) {
                high = hash[j];
            }
        }
        return high + low;
    }
}
