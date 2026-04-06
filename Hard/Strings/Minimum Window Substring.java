//Problem: Minimum Window Substring
//Link:
https://leetcode.com/problems/minimum-window-substring/description/
// Hard Level
//Approach: using hashmap;
class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0) + 1);
        }
        int left = 0;
        int right = 0;
        int count = t.length();
        int min_len = Integer.MAX_VALUE;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(right))) {
                if (map.get(s.charAt(right)) > 0) {
                    count--;
                }
                map.put(s.charAt(right), map.get(s.charAt(right)) - 1);
            }
            right++;

            while (count == 0) {
                if (right - left < min_len) {
                    min_len = right - left;
                    start = left;
                }
                if (map.containsKey(s.charAt(left))) {
                    map.put(s.charAt(left), map.get(s.charAt(left)) + 1);
                    if (map.get(s.charAt(left)) > 0) {
                        count++;
                    }
                }
                    left++;
            }
        }
        if (min_len == Integer.MAX_VALUE) {
            return "";
        } else {
            return s.substring(start, start + min_len);
        }
    }
}
