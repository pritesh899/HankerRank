
public class CompareTheTriplets 
{
	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) 
	{
        int result[] = {0,0};
        
        if(a0 > b0)
        {
            result[0] = result[0] + 1;
        }else{
            result[1] = result[1] + 1;
        }
        
        if(a1 == b1)
        {
            result[0] = result[0] + 0;
            result[1] = result[1] + 0;
        }
        if(a2 < b2)
        {
            result[1] = result[1] + 1;
        }else{
            result[0] = result[0] + 1;
        }
        return result;
    }
	

    public static void main(String[] args) 
    {
    	int a0 = 5 ;
        int a1 = 6;
        int a2 = 7;
        int b0 = 3;
        int b1 = 6;
        int b2 = 10;
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        System.out.println(result[0] +" "+result [1]);

        
    }
}

