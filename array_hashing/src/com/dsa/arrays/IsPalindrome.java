package com.dsa.arrays;

public class IsPalindrome {

    public static boolean isPalindrome(String s) {
        if(s.length() == 0) return false;

        String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase().trim();

        int i = 0, j = str.length() - 1;

        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "Was it a car or a cat I saw?";
        String s2 = "Hello, world!";
        
        System.out.println("\"" + s1 + "\" is palindrome? " + isPalindrome(s1));
        System.out.println("\"" + s2 + "\" is palindrome? " + isPalindrome(s2));
    }
}
