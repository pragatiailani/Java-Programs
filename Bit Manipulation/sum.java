/*
Q. Given two integers a and b. Find the sum of two numbers without using arithmetic operators.

Example 1:
    Input: a=5, b=3
    Output: 8
    Explanation : 5 + 3 = 8

Example 2:
    Input: a = 10, b = 30
    Output: 40
    Explanation: 10 + 30 = 40
*/

class sum{
    public static int solution(int a, int b){
        while (b!=0){
            int carry=a&b;
            a=a^b;
            b=carry<<1;
        }
        return a;
    }
}

// Expected Time Complexity : O(max(number of bits in 'a', number of bits in 'b'))
// Expected Auxiliary Space : O(1)
// Total Time Taken: 