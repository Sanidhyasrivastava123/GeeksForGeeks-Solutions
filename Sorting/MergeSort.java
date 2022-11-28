class Solution
{
void merge(int arr[], int l, int m, int r)
{
// Your code here
int merged[]=new int[r-l+1];
int index1 = l;
int index2 = m+1;
int x=0;
while(index1<=m && index2<=r)
{
if(arr[index1]<=arr[index2])
{
merged[x]=arr[index1];
x++;
index1++;

}
else if(arr[index1]>=arr[index2])
{
merged[x]=arr[index2];
x++;
index2++;

}

}
while(index1<=m)
{
merged[x]=arr[index1];
x++;
index1++;
}
while(index2<=r)
{
merged[x]=arr[index2];
x++;
index2++;
}

for(int i=0;i<merged.length;i++){
arr[l+i]=merged[i];
}
}
void mergeSort(int arr[], int l, int r)
{
if(l>=r)
{
return;
}
int m = l + (r-l) / 2;
mergeSort(arr,l,m);
mergeSort(arr,m+1,r);
merge(arr,l,m,r);
}
}