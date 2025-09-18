package com.basicRecursion;

import java.util.ArrayList;

public class CheckArraySorted {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(checkArraySorted(arr));

    }

    private static boolean checkArraySorted(ArrayList<Integer> arr) {
        int i = 0;
        int j = 1;
        if (arr.size() <= 1) {
            return true;
        }

        return check(arr, i, j);
    }

    private static boolean check(ArrayList<Integer> arr, int i, int j) {
        if (j > arr.size() - 1) {
            return true;
        }
        if (arr.get(j) < arr.get(i)) {
            return false;
        }

        return check(arr, i + 1, j + 1);
    }

}
