/* Problem Statement :-
Given a stack, delete the middle element of the stack without using any additional data structure.
Middle element:- floor((size_of_stack+1)/2) (1-based indexing) from bottom of the stack.
*/

// Answer:-

class Solution {
    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
        deleteMidUtil(s, (sizeOfStack + 1) / 2, 1);
    }

    private void deleteMidUtil(Stack<Integer> s, int mid, int current) {
        if (s.isEmpty()) {
            return;
        }
        
        int x = s.pop();
        
        if (current != mid) {
            deleteMidUtil(s, mid, current + 1);
            s.push(x);
        }
    }
}
