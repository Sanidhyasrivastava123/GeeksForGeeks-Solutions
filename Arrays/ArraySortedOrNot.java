class Solution {
boolean arraySortedOrNot(int[] arr, int n) {
for(int i=0;i<n-1;i++){
if(arr[i+1]<arr[i]) return false;
}
return true;
}
}