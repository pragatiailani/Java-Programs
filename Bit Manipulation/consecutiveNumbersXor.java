/* 
Q. You are given an array arr[], you have to re-construct an array arr[].
The values in arr[] are obtained by doing Xor of consecutive elements in the array.

Example 1:
    Input : arr[ ] = {10, 11, 1, 2, 3}
    Output : 1 10 3 1 3
    Explanation:
        At index 0, arr[0] xor arr[1] = 1
        At index 1, arr[1] xor arr[2] = 10
        At index 2, arr[2] xor arr[3] = 3
        ...
        At index 4, No element is left So, it will remain as
        it is.
        New Array will be {1, 10, 3, 1, 3}.

Example 2:
    Input : arr[ ] = {5, 9, 7, 6} 
    Output :  12 14 1 6 
*/

class consecutiveNumbersXor {
    public static int[] solution(int arr[], int n){
        for(int i=0; i<n; i++){
            if(i<n-1){
                arr[i]=arr[i]^arr[i+1];
            }
        }
        return arr;
    }    
}

// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(1).
// Total Time Taken: 0.5/1.6
 