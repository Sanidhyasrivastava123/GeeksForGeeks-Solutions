For Union of 2 Arrays:
class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet <Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            hs.add(a[i]);
        }
        for(int i=0;i<m;i++)
        {
            hs.add(b[i]);
        }
        
        return hs.size();
    }
}



For Intersection of 2 Arrays:


class Solution
{
    public int[] intersection(int[] A, int[] B)
	{
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setAB = new HashSet<>();
		int i = 0;

        for(int n : A)
			setA.add(n);

        for(int n : B)
		{
            if(setA.contains(n))
			{
                setAB.add(n);
            }
        }

        int[] result = new int[setAB.size()];

		for(int n : setAB)
            result[i++] = n;

        return result;
    }
}
