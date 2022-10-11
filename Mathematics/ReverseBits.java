class Solution {
    static Long reversedBits(Long X) {
        // code here
        long res=0;
        for(int i=0;i<32;i++)
        {
            long bit=((X >>i)& 1);
            res=res | (bit << (31-i));
        }
        return res;
    }
};