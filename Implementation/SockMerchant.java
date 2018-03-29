package Implementation;

public class SockMerchant {
	static int sockMerchant(int n, int[] ar) 
	{
		int result = 0;
		int []total = new int[101];
		for(int i = 0 ;i < 101 ; i++)
		{
			total[0] = 0;
		}
		for(int i = 0; i < ar.length;i++)
		{
			for(int j = 1; j <= 100; j++)
			{
				if(ar[i] == j)
				{
					total[j]++;
				}
			}
		}
		for(int i = 0; i< total.length; i++)
		{
			if(total[i] != 0)
			{
				if(total[i]%2 ==0 )
				{
					result = result + (total[i]/2);
				}else
				{
					result = result + (int)Math.floor(total[i]/2);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) 
	{
	    int n = 1;
	    int[] ar ={10, 20, 20, 10, 10, 30, 50, 10, 20};
	    int result = sockMerchant(n, ar);
	    System.out.println(result);
	}
}
