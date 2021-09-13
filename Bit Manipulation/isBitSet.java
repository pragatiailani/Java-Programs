/*
Q. Given a number N. You have to check whether every bit in the binary representation of the given number is set or not.

Example 1:
    Input: 7
    Output: 1
    Explanation: Binary for 7 is 111 all the bits are set so output is 1
*/
class IsBitSet{
    static int solution1(int N){
        return ((N&(N+1))==0 ? 1:0);
    }

    static int solution2(int N){
        return ((Math.log(N+1)/Math.log(2) - Math.floor(Math.log(N+1)/Math.log(2)))==0 ? 1 : 0);
    }
}
// Expected Time Complexity: O(1)
// Expected Space Complexity: O(1)
// Total Time Taken: 0.2/1.5