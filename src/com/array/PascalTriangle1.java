package com.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle1 {
    public static void main(String[] args) {
        System.out.println(pascalTriangle1(5, 3));
    }

    public static int pascalTriangle1(int r, int c) {
        return printPascal(r, r, c);
    }

    private static int printPascal(int n, int r, int c) {
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

        return ans.get(r-1).get(c-1);
    }

}
