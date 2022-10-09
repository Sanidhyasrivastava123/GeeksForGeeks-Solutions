class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue <Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<k;i++)
        {
            pq.add(arr[i]);
        }
        for(int i=k;i<r;i++)
        {
            if(pq.peek()>arr[i])
            {
                pq.remove();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    } 
}