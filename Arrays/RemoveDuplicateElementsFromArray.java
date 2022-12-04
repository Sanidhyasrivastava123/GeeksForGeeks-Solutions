class Solution {
int remove_duplicate(int A[],int N){
// code here
int i=0;
for(int j=0;j<N;j++)
{
if(A[j]!=A[i])
{
i++;
A[i]=A[j];
}
}
return i+1;

}
}