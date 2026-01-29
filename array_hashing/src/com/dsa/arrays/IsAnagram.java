package com.dsa.arrays;

public class IsAnagram {

	public static boolean isAnagram(String s, String t) {
        int[] occ1 = new int[26];
        int[] occ2 = new int[26];

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            occ1[s.charAt(i) - 'a']++;
            occ2[t.charAt(i) - 'a']++;
        }

        for(int j = 0; j < 26; j++){
            if(occ1[j] != occ2[j]) return false;
        }

        return true;
	}
	
	public static void main(String[] args) {
		String s1 = "racecar";
		String t1 = "raeccra";
		System.out.println(isAnagram(s1, t1));
				
	}

}
