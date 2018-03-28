//	You are given an array of n integers, a0,a1..an , and a positive integer,k . 
//	Find and print the number of  pairs where i < j and a[i] + a[j]  is divisible by k.


package Implementation;

public class DivisibleSumPairs 
{	
	static int divisibleSumPairs(int n, int k, int[] ar) 
	{
		int a = 0;
		for(int i = 0; i<ar.length; i++)
		{
			for(int j =i ;j< n;j++)
			{
				if( (i < j) && ((ar[i]+ar[j])%k == 0) )
				{
					a++;
				}
			}
		}
		return a;   
    }
	public static void main(String[] args) 
	{
		int n = 6;
        int k = 3;
        int[] ar = {1, 3, 2, 6, 1, 2};
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
	}

}
