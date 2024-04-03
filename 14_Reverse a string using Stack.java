/* Problem Statement :-
You are given a string S, the task is to reverse the string using stack.
*/

// Answer :-

class Solution {
    
    public String reverse(String S){
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < S.length(); i++) {
            stack.push(S.charAt(i));
        }
        
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        
        return reversed.toString();
    }

}
