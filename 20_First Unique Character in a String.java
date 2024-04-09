/* Problem Statement :-
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
*/

// Answer :-

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
                for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
