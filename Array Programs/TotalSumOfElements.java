/* 
Q. Given an array of N integers. Your task is to print the sum of all of the integers.

Example 1: 
    Input: 4
        1 2 3 4
    Output: 10

Example 2: 
    Input: 6
        5 8 3 10 22 45
    Output: 93
*/

class TotalSum {
    
    public long solution(long a[], long n)
    {
        int sum=0;
        for (int i=0; i<n; i++)
            sum+=a[i];
        return (long)(sum);
    }
}

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)
// Total Time Taken: 