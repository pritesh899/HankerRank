//	Given five positive integers, find the minimum and maximum values that
//	can be calculated by summing exactly four of the five integers. Then 
//	print the respective minimum and maximum values as a single line of 
//	two space-separated long integers.

public class MiniMaxSum 
{
    static void miniMaxSum(int[] arr) 
    {
        int i,j;
    	long sum = 0;
    	long []sum1 = new long[5];
    	for(i = 0;  i<arr.length  ; i++ )
    	{
    		sum = sum + arr[i];
    		
    	}
    	for(j = arr.length-1;j>=0;j--)
    	{
    		sum1[j] = sum - arr[j];
    	
    	}
    	 long smallest = sum1[0];
         long biggest = sum1[0];
        
         for(int k=1; k< sum1.length; k++)
         {
                 if(sum1[k] > biggest)
                         biggest = sum1[k];
                 else if (sum1[k] < smallest)
                         smallest = sum1[k];
         }
         System.out.println(smallest+" "+ biggest);
    	
    }


    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 ,4 ,5};
        miniMaxSum(arr);
    }
}

