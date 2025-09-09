package com.string;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(validAnagram(s, t));
    }

    private static boolean validAnagram(String s, String t) {

        int hash1[] = new int[27];
        int hash2[] = new int[27];

        for (int i = 0; i < s.length(); i++) {
            hash1[s.charAt(i) - 'a']++;
        }
        for (int j = 0; j < t.length(); j++) {
            hash2[t.charAt(j) - 'a']++;
        }
        for (int k = 0; k <= 26; k++) {
            if (hash1[k] != hash2[k]) {
                return false;
            }
        }

        return true;
    }

}
