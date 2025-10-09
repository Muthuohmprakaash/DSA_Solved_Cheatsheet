package com.array;

import java.util.*;

public class PascalsTriangle3 {
    public static void main(String[] args) {
        System.out.println(printPascal(5));
    }
    private static List<List<Integer>> printPascal(int n){
          List<List<Integer>> ans = new ArrayList<>();

        for(int i =0;i<n;i++){
            List<Integer> ls = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                if(j == 0 || j==i){
                    ls.add(1);
                }else{
                    ls.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j)); 
                }
            }
            ans.add(ls);
        }



          return ans;
    }
}
