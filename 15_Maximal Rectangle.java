/* Problem Statement :-
Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
*/

// Answer :-

class Solution {
    public int maximalRectangle(final char[][] matrix) {
        final int n = matrix[0].length;
        final int[] heights = new int[n];
        final int[] minLeft = new int[n];
        final int[] minRight = new int[n];
        
        int res = 0;
        for (char[] row : matrix) {
            for (int i = 0; i < n; ++i) {
                heights[i] = row[i] == '1' ? heights[i] + 1 : 0;
            }
            
            minLeft[0] = -1;
            for (int i = 1; i < n; ++i) {
                int p = i - 1;
                while (p >= 0 && heights[i] <= heights[p]) {
                    p = minLeft[p];
                }
                minLeft[i] = p;
            }

            minRight[n - 1] = n;
            for (int i = n - 2; i >= 0; --i) {
                int p = i + 1;
                while (p < n && heights[i] <= heights[p]) {
                    p = minRight[p];
                }
                minRight[i] = p;
            }

            for (int i = 0; i < n; ++i) {
                res = Math.max(res, heights[i] * (minRight[i] - minLeft[i] - 1));
            }
        }

        return res;
    }
}
