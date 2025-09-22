package com.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 7, 4, 1, 5, 3 };
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    private static int[] insertionSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            swapInCorrectPlace(arr, i);
        }
        return arr;
    }

    private static int[] swapInCorrectPlace(int[] arr, int i) {
        if (arr[i] > arr[i - 1]) {
            return arr;
        }
        while (i > 0 && arr[i] < arr[i - 1]) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;

            i = i - 1;
        }
        return arr;
    }

}
