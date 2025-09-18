package com.basicRecursion;

import java.util.ArrayList;

public class ReverseStringI {
    public static void main(String[] args) {
        ArrayList<Character> s = new ArrayList<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');
        System.out.println(reverseString(s));
    }

    private static ArrayList<Character> reverseString(ArrayList<Character> ls) {
        ArrayList<Character> reversed = new ArrayList<>();
        return reverse(ls, reversed, 0);
    }

    private static ArrayList<Character> reverse(ArrayList<Character> ls, ArrayList<Character> rv, int count) {
        if (count >= ls.size()) {
            return rv;
        }
        reverse(ls, rv, count + 1);
        rv.add(ls.get(count));
        return rv;

    }
}