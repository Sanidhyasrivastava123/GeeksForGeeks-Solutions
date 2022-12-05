class Solution
{
void leftRotate(long arr[], int k,int n)
{
k = k%n;
if(k == 0)
return;
long arr2[] = new long[k];

for(int i = 0; i < k; i++){
arr2[i] = arr[i];
}

for(int i = k ; i < n ; i++){
arr[i-k] = arr[i];
}

for(int i = 0; i < k; i++){
arr[n-k+i] = arr2[i];
}

}
}