class Solution
{
//Function to sort an array using quick sort algorithm.
static void quickSort(int arr[], int low, int high)
{
// code here
if(low<high)
{
int p=partition(arr,low,high);
quickSort(arr,low,p-1);
quickSort(arr,p+1,high);

}
}
static int partition(int arr[], int low, int high)
{
// your code here
int pivot=arr[high];
int i=low;
int j=high;
while(i<j)
{
while(i<j && arr[i]<=pivot)
i++;
while(i<j && arr[j]>=pivot)
j--;
if(i<j)
{
int t=arr[i];
arr[i]=arr[j];
arr[j]=t;
}
}
arr[high]=arr[i];
arr[i]=pivot;
return i;
}
}
