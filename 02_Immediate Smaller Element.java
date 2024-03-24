/* Problem Statement :-
Given an integer array Arr of size N. For each element in the array, check whether the right adjacent element (on the next immediate position) of the array is smaller.
If next element is smaller, update the current index to that element. If not, then  -1.
*/

// Answer :-

class Solution {
    
    void immediateSmaller(int arr[], int n) {
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1];
            } else {
                arr[i] = -1;
            }
        }
        arr[n - 1] = -1;
    }
}
