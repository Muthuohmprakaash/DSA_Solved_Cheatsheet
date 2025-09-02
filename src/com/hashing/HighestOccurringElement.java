package com.hashing;

public class HighestOccurringElement {
    public static void main(String[] args) {
        int arr[] = { 100, 200, 200, 300, 300 };
        int ans = findHighest(arr);
        System.out.println(ans);
    }

    private static int findHighest(int arr[]) {
        int hash[] = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        int highest = 0;
        int ans = 0;
        for (int j = 0; j < hash.length; j++) {
            if (hash[j] > highest) {
                highest = hash[j];
                ans = j;

            }
        }
        return ans;
    }

}
