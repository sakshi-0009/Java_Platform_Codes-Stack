/* Problem Statement :-
There are given N ropes of different lengths, we need to connect these ropes into one rope. The cost to connect two ropes is equal to sum of their lengths.
The task is to connect the ropes with minimum cost. Given N size array arr[] contains the lengths of the ropes. 
*/

// Answer :-

class Solution {
    long minCost(long arr[], int n) {
        if (n == 1) {
            return 0;
        }
        
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        
        for (long length : arr) {
            minHeap.offer(length);
        }
        
        long totalCost = 0;
        
        while (minHeap.size() > 1) {
            long first = minHeap.poll();
            long second = minHeap.poll();
            
            long cost = first + second;
            totalCost += cost;
            
            minHeap.offer(cost);
        }
        
        return totalCost;
    }
}
