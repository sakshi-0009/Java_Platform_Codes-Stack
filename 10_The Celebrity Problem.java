/*
Problem Statement :-
A celebrity is a person who is known to all but does not know anyone at a party. If you go to a party of N people, find if there is a celebrity in the party or not.
A square NxN matrix M[][] is used to represent people at the party such that if an element of row i and column j  is set to 1 it means ith person knows jth person. Here M[i][i] will always be 0.
Return the index of the celebrity, if there is no celebrity return -1.
Note: Follow 0 based indexing.
Follow Up: Can you optimize it to O(N)
*/

// Ansswer :-

class Solution { 
    int celebrity(int M[][], int n) {
    	int candidate = 0;
        
        for (int i = 1; i < n; i++) {
            if (M[candidate][i] == 1) {
                candidate = i;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (i != candidate && (M[candidate][i] == 1 || M[i][candidate] == 0)) {
                return -1;
            }
        }
        
        return candidate;
    }
}
