/* Problem Statement :-
Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.

The following rules define a valid string:

Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
*/

// Answer :-

class Solution {
    public boolean checkValidString(String s) {
        int left=0,right=0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(') {right++;left++;}
            else if(c==')') {
                right--;
                if(left>0)left--;
            }
            else{
                right++;
                if(left>0) left--;
            }
            if(right<0) return false;
        }
        return left==0;
    }
}
