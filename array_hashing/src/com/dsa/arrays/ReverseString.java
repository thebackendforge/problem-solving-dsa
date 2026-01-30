package com.dsa.arrays;

import java.util.Arrays;

public class ReverseString {

    public static void reverseString(char[] s) {
        int i = 0, j = s.length - 1;

        while(i <= j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        System.out.println("Before: " + Arrays.toString(s));
        reverseString(s);
        System.out.println("After:  " + Arrays.toString(s));
    }
}
