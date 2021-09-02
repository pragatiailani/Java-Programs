/* 

Q. Given a positive integer N, print count of set bits in it. 

Example 1: 
    Input: 6
    Output: 2
    Explanation: Binary representation is '110' 
    So the count of the set bit is 2. 

Example 2:
    Input: 8
    Output: 1
    Explanation: Binary representation is '1000' 
    So the count of the set bit is 1.
*/

//Naive Solution
class setBits {
     static int navieSolution(int N){
        int count=0;
        while (N!=0){
            count+=N&1;
            N=N>>1;
        }
        return count;
    }


// Expected Time Complexity: O(LogN)
// Expected Auxiliary Space: O(1)
// Total Time Taken: 0.2/1.3


//Effective Solution: Brian Kernighan's Algorithm
    static int effectiveSolution(int N){
        int count=0;
        while(N!=0){
            N=N&(N-1);
            count++;
        }
        return count;
    }
}
// Total Time Taken: 0.0/1.1