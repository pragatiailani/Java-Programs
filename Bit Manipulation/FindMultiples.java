/*
Q. Given an array A comprising of N non-zero, positive integers and an integer X, find the logical OR of all such elements in the array that are a multiple of X. The result of OR operation should be  in decimal form. If no multiple of X is found, the answer should be 0.

Example 1: 
    Input: N = 4 , X = 2, A = {3 , 4 , 3 , 9}
    Output: 4
    Explanation:Only multiple of 2 in array is 4. Hence it is printed.

Example 2:
    Input: N = 3 , X = 8, A = {1,2,3}
    Output: 0
    Explanation: There are no multiples of 8 in the array. So, Output is 0.

*/

class Multiple{
    static int solution(int N, int X, int A[]){
        int answer=0;
        for (int i=0; i<N; i++)
            if (A[i]%X==0)
                answer = answer | A[i];
        return answer;
    }
}

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(N)
// Total Time Taken: 0.7/2.3