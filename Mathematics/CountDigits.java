class Solution{
    static int evenlyDivides(int N){
        // code here
        int rem=0,count=0;
        int temp=N;
        while(N>0)
        {
            rem=N%10;
            if(rem != 0 && temp %rem==0)
            {
                count=count+1;
            }
            N=N/10;
        }
        return(count);
    }
}