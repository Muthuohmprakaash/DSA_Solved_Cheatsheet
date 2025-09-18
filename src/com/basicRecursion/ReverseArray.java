package com.basicRecursion;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int[] ans = reverse(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        return swapArr(i, j, arr);
    }

    private static int[] swapArr(int i, int j, int[] arr) {

        if (i >= j) {
            return arr;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return swapArr(i + 1, j - 1, arr);

    }

}
