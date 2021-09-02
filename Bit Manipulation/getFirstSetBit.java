/* 
Q. Given an integer an N. The task is to return the position of first set bit found from the right side in the binary representation of the number. 

Example 1: 
    Input: N = 18
    Output: 2
    Explanation: Binary representation of 
    18 is 010010,the first set bit from the 
    right side is at position 2.

Example 2: 
    Input: N = 12 
    Output: 3 
    Explanation: Binary representation 
    of  12 is 1100, the first set bit 
    from the right side is at position 3.
*/

class getFirstSetBit {
    static int solution(int n){
        int count=0, var;
        while (n!=0){
            count=count+=1;
            var = n&1;
            if (var>0){
                return count;
            }
            n=n>>1;
        }
        return 0;
    }
}

// Expected Time Complexity: O(logn)
// Expected Auxiliary Space: O(1).
// Time Taken: 0.2/1.2