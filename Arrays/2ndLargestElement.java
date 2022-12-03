class Solution {
int print2largest(int arr[], int n) {
int second_largest=-1;
int largest=arr[0];
for(int i=0;i<n;i++)
{
if(arr[i]>largest)
{
second_largest=largest;
largest=arr[i];
}
else if(arr[i]>second_largest && arr[i]<largest)
second_largest=arr[i];
}

return second_largest;
// code here
}
}