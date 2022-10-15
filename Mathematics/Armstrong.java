class Solution {
    static String armstrongNumber(int n){
    int len = ((int)Math.log10(n) + 1);
    int sum = 0, num = n;
    for(int i=0;i<len; i++){
        int rem = n%10;
        sum += Math.pow(rem,3);
        n /= 10;
        }
    if(sum == num)
    return "Yes";
    else
    return "No";
}