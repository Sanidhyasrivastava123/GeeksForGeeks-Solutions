public void insertionSort(int arr[], int n)
{
//code here
for (int i=1; i<n; i++){
int curr=arr[i];
int j=i-1;
while(j>=0 && curr<arr[j]){
arr[j+1]=arr[j];
j--;
}
arr[j+1]=curr;
}

}
}