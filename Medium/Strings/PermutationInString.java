//Problem: Permutation in String
//Link:
https://leetcode.com/problems/permutation-in-string/description/
// Medium Level
//Approach:  i used two array to store freq and if the freq is same i got the answer;

class Solution {
    public boolean isfreqsame(int freq_s1 [],int freq_s2 []){
        for(int i=0; i<26; i++){
            if(freq_s1[i]!=freq_s2[i]){
                return false;
            }
        } 
         return true;
    }
    
    public boolean checkInclusion(String s1, String s2) {
        int freq_s1 []=new int [26];
        int freq_s2 []=new int [26];

        for(int i=0; i<s1.length(); i++){
            int s1_idx=s1.charAt(i)-'a';
            freq_s1[s1_idx]++;
        }

        int windowsize=s1.length();
        

        for(int i=0; i<s2.length(); i++){
           int window_idx=0;
            int idx=s2.charAt(i)-'a';
            freq_s2[idx]++;

               if (i >= windowsize) {
                freq_s2[s2.charAt(i - windowsize) - 'a']--;
            }   
            
        
            if(isfreqsame(freq_s1,freq_s2)){
                return true;
            }
        }
        return false;
    }
}
