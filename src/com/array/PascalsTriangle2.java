package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pascal2(3)));
    }
    private static int[] pascal2(int r){
        return printPascal(r,r);
    }
    private static int[] printPascal(int n, int r) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> ls = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    ls.add(1);
                } else {
                    ls.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                }
            }
            ans.add(ls);
        }
        int[] arrAns = new int[r];
        for(int i = 0; i<ans.get(r-1).size();i++){
            arrAns[i] = ans.get(r-1).get(i);
        }
        return arrAns;
    }
}
