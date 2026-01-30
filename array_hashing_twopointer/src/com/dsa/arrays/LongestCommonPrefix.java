package com.dsa.arrays;

public class LongestCommonPrefix {

    public static	 String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;

        for(String str: strs){
            if(str.length() < minLength) minLength = str.length();
        }
        
        StringBuilder sb = new StringBuilder("");

        for(int i = 0; i < minLength; i++){
            char ch = strs[0].charAt(i);
            for(int j = 0; j < strs.length; j++){
                if(strs[j].charAt(i) != ch){
                    return sb.toString();
                }
            }
            sb.append(ch);
        }

        return sb.toString();
    }
	
	public static void main(String[] args) {
		String[] strs = {"dance","dag","danger","damage"};
		System.out.println(longestCommonPrefix(strs));
	}

}
