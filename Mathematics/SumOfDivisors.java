class Solution{
    static long sumOfDivisors(int n){
    // code here
    long total = 0;
    for(int i=1; i<=n; i++){
        total += (n / i) * i;
    }
    return total;
    }
}