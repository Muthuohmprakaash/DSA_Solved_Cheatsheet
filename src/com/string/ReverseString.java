package com.string;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        List<Character> s = new ArrayList<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');
        reverse(s);
        for (char x : s) {
            System.out.print(x);
        }
    }

    private static void reverse(List<Character> s) {
        int i = 0;
        int j = s.size() - 1;

        while (i < j) {
            char temp1 = s.get(i);
            char temp2 = s.get(j);
            s.set(i, temp2);
            s.set(j, temp1);
            i++;
            j--;

        }
        return;
    }

}
