package Implementation;

public class BirthdayChocolates 
{
	static int solve(int n, int[] s, int d, int m)
    {
        int a =0;
        int sum[] = new int[n];
    	int i,j;
    	//If you are testing for all cases in the hankerRank use only s.length in the for loop 
        for(i=0;i< s.length-1 ;i++)
        {
           
        	int temp = 0;
        	for(j=i;j<i+m && j<s.length;j++)
        	{
        		temp = temp + s[j];
        	}
        	sum[i] = temp;
        	if(sum[i] == d)
        	{
        		a++;
        	}
        }
    	return a;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] s = {1,2,1,3,2};
        int d = 3;
        int m = 2;
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}

