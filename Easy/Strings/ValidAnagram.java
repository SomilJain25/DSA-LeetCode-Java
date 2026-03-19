//Problem: Valid Anagram
//Link:
https://leetcode.com/problems/valid-anagram/description/
//Easy Level
//Approach:  i used two array which store freqency of both the string and 
            // at the end if both the array have same freq then it is anagram;

class Solution {
    public boolean isAnagram(String s, String t) {
        int arr1[]=new int [26];
        int arr2[]=new int [26];
        if (s.length() != t.length()) {
            return false;
        }

        for(int i=0;i<s.length(); i++){
            int idx=s.charAt(i)-'a';
            arr1[idx]++;
        }
         for(int i=0;i<t.length(); i++){
            int idx2=t.charAt(i)-'a';
            arr2[idx2]++;
        }
        for(int i=0;i<26; i++){
        if(arr1[i]!=arr2[i]){
            return false;
        }
        }
        return true;
    }
}
