package com.dsa.arrays;

public class MergeStrings {

    // Static method to merge two strings alternately
    public static String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0, k = 1;
        StringBuilder sb = new StringBuilder();

        while (i < word1.length() && j < word2.length()) {
            if (k % 2 != 0) {
                sb.append(word1.charAt(i));
                i++;
            } else {
                sb.append(word2.charAt(j));
                j++;
            }
            k++;
        }

        while (i < word1.length()) {
            sb.append(word1.charAt(i));
            i++;
        }

        while (j < word2.length()) {
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();
    }

    // Main method with sample test cases
    public static void main(String[] args) {
        // Test case 1
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println("Test 1: mergeAlternately(\"" + word1 + "\", \"" + word2 + "\") = " +
                           mergeAlternately(word1, word2));
        // Expected output: "apbqcr"

        // Test case 2
        word1 = "hello";
        word2 = "world";
        System.out.println("Test 2: mergeAlternately(\"" + word1 + "\", \"" + word2 + "\") = " +
                           mergeAlternately(word1, word2));
        // Expected output: "hweolrllod"

        // Test case 3: different lengths
        word1 = "short";
        word2 = "longer";
        System.out.println("Test 3: mergeAlternately(\"" + word1 + "\", \"" + word2 + "\") = " +
                           mergeAlternately(word1, word2));
        // Expected output: "slhoonrgter"
    }
}
