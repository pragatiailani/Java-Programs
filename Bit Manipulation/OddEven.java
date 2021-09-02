/* 
Q. Given a positive integer N, determine whether it is odd or even.

Example 1: 
    Input: 5
    Output: odd

Example 2: 
    Input: 2
    Output: even
*/

// Naive Approach
class OddEven{
    static String solution(int N){
        return (N&1)>0 ? "odd" : "even";
    }
}

// Expected Time Complexity: O(1)
// Time Taken: 0.1/2.7 