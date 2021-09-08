/*
Q. Given a number N, change all bits at even positions to 0.

Example 1:
    Input: N = 30
    Output: 10 
    Explanation: Binary representation of 
    11110. Bits at Even positions are 
    highlighted. After making all of them 
    0, we get 01010. Hence the answer is 10.

Example 2: 
    Input:  N = 10
    Output: 10
    Explanation: Binary representation of 
    1010. Bits at Even positions are 
    highlighted. After making all of them 
    0, we get 1010. Hence the answer is 10.
*/

class convertEvenBitToZero{
    static long solution(long n){
        return (n&0xAAAAAAAA);
    }
}

// Expected Time Complexity: O(1)
// Expected Auxiliary Space: O(1)
// Total Time Taken: 