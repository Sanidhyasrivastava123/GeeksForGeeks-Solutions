class Solution {
    static long gcd(long a, long b) {
        if(b == 0) return a;
        else return gcd(b, a%b);
    }
    static Long[] lcmAndGcd(Long A , Long B) {
    // code here
    Long res[] = new Long[2] ;
    long hcf = 1, lcm = 1;
    hcf = gcd(A, B);
    lcm = A * B / hcf;
    res[0] = lcm;
    res[1] = hcf;
    return res;
    }
};