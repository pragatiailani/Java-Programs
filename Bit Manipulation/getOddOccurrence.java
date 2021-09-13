/*
Q. Given an array of N positive integers where all numbers occur even number of times except one number which occurs odd number of times. Find the exceptional number.

Example 1:
    Input: 7 {1, 2, 3, 2, 3, 1, 3}
    Output: 3

Example 2:
    Input: 7 {5, 7, 2, 7, 5, 2, 5}
    Output: 5
*/


class GetOddOccurrence {
    int solution(int[]arr, int n){
        int ans=0;
        for (int i=0; i<n; i++){
            ans^=arr[i];
        }
        return ans;
    }
}

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)
// Total Time Taken: 0.6/3.4