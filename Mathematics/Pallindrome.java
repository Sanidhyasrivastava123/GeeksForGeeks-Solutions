class Solution {
public String is_palindrome(int n) {
int reversed_num = 0; int num = n;
while(num > 0) {
reversed_num = (reversed_num * 10) + (num % 10);
num /= 10;
}
return (reversed_num == n) ? "Yes" : "No";
}
}