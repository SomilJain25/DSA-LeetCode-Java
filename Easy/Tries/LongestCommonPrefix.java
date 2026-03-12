//Problem: Longest Common Prefix
//Link:
https://leetcode.com/problems/longest-common-prefix/description/
//Easy Level
//Approach: i used tries to solve this q. if tries concept is clear then it is easy to solve this q.

class Solution {
    static class Node {
        Node[] children;
        boolean eow;
        int childcount = 0;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        if (word.length() == 0) {
        curr.eow = true;
        return;}

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
                curr.childcount++;
            }
            curr = curr.children[idx];
            if (i == word.length() - 1) {
                curr.eow = true;
            }
        }
    }

    public String longestCommonPrefix(String[] strs) {
      root = new Node();
        StringBuilder sb = new StringBuilder();

        if (strs.length == 0) {
            return "";
        }
        for (String s : strs) {
            insert(s);
        }
        Node curr = root;
        while (curr.childcount == 1 && curr.eow == false) {
            for (int i = 0; i < 26; i++) {
                if (curr.children[i] != null) {
                    sb.append((char) (i + 'a'));
                    curr = curr.children[i];
                    break;
                }
            }
        }
        return sb.toString();
    }
}
