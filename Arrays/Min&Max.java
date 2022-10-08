//User function Template for Java

/*
 class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min=a[0];
        long max=a[0];
        for(int i=1;i<n;i++){
            max=Math.max(max,a[i]);
            min=Math.min(min,a[i]);
        }
        pair minmax =new pair(min,max);
        return minmax;
    }
}