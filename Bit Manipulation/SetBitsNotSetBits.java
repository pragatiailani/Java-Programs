/*
Q. Mrs. S is very intelligent and very curious to learn new things. She was learning few Bit-algorithms but stuck somewhere and wants your help. The task is to count the set-bits and non set-bits of an integer N. Help her doing the same.

Example 1:
    Input: 8
    Output: Set Bits: 1
            Not Set Bits: 3
    Explanation: 8 in binary is 1000. There is only 1 set bit and 3 not set bits.

*/

class SetBitsNotSetBits{
    public void count(long n){
        int setCount=0, notSetCount=0;
        while (n!=0){
            if (n%2==0)
                notSetCount+=1;
            else
                setCount+=1;
            n=n>>1;
        }
        System.out.print("Set Bits: "+setCount);
        System.out.println("Not Set Bits: "+notSetCount);
    }
}

// Total Time Taken: 