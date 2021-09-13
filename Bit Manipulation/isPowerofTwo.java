/* 
Q. Given a non-negative integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some x.

Example 1:
    Input: 1
    Output: true
    Explanation: 1 is equal to 2 raised to 0 (2^0 = 1).

Example 2:
    Input: 98
    Output: false
    Explanation: 98 cannot be obtained by any power of 2.
*/

class IsPowerofTwo{

//Naive Solution
    public static boolean naiveSolution(long n){
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return (count==1) ? true : false;
    }


// Expected Time Complexity: O(log N).
// Expected Auxiliary Space: O(1).
// Total Time Taken: 0.8/2.0


//Effective Solution
    public static boolean effectiveSolution(long n){
        return (n==0) ? false : ((n&(n-1))==0); 
    }
}
// Total Time Taken: 0.8/2.0
