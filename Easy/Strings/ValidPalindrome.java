//Problem: Valid Palindrome
//Link:
https://leetcode.com/problems/valid-palindrome/description/
//Easy Level
//Approach:  convert all uppercase letters into lower case then check palindrome easily;

class Solution {
    public boolean isPalindrome(String s) {
        String t=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(t.length()==0){
            return true;
        }
        int right=t.length()-1;
            int left=0;
        while(left<right){  
            if(t.charAt(left)!=t.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
