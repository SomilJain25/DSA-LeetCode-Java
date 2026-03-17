//Problem: Reverse Words in a String
//Link:
https://leetcode.com/problems/reverse-words-in-a-string/description/
// Medium Level
//Approach: Reverse the whole string and Traverse reversed string and pick words;
          //Reverse each word again then append it into answer and Remove extra starting space;

class Solution {
    public String reverseWords(String s) {
        String reverse_string = "";
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse_string += s.charAt(i);
        }
        for (int i = 0; i < reverse_string.length(); i++) {
            String word = "";
            while (i < reverse_string.length() && reverse_string.charAt(i) !=' ') {
                word += reverse_string.charAt(i);
                i++;
            }
            String reverse_word = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverse_word += word.charAt(j);
            }
            if (reverse_word.length() > 0) {
                ans += (' ' + reverse_word);
            }
        }
        return ans.substring(1);
    }
}
