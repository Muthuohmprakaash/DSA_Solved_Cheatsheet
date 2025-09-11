package com.basicRecursion;

public class SumofFirstnNumbers {
    public static void main(String[] args) {
        SumofFirstnNumbers s = new SumofFirstnNumbers();
        System.out.println(s.NnumbersSum(10));
    }

    public int NnumbersSum(int N) {

        if (N == 0) {
            return 0;
        }
        int ans = NnumbersSum(N - 1);
        ans = ans + N;
        return ans;
    }

}
