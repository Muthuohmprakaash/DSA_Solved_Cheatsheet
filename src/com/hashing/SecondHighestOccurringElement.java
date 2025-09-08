package com.hashing;

public class SecondHighestOccurringElement {
    public static void main(String[] args) {
        int arr[] = { 4, 4, 5, 5, 6, 7 };
        System.out.println(findSecondHighest(arr));
    }

    private static int findSecondHighest(int[] arr) {

        int hash[] = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        int largest = 0;
        int secLar = 0;
        int element1 = -1;
        int element2 = -1;

        for (int j = 0; j < hash.length; j++) {
            int count = hash[j];
            if (count == 0) {
                continue;
            }
            if (count > largest) {
                element2 = element1;
                secLar = largest;
                element1 = j;
                largest = count;

            } else if (count > secLar && count < largest) {

                element2 = j;
                secLar = count;

            }

        }
        return element2;
    }
}
