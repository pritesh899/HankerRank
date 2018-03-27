//	Given an array of integers, find the sum of its elements.
//	
//	Input Format
//	
//	The first line contains an integer, , denoting the size of the array. 
//	The second line contains  space-separated integers representing the array's elements.
//	
//	Output Format
//	
//	Print the sum of the array's elements as a single integer.
//	
//	Sample Input : 
//	
//	6
//	1 2 3 4 10 11

//	Sample Output : 31
//	
//	



public class SimpleArraySum 
{

    static int simpleArraySum(int arCount,int[] ar ) 
    {
        int ara = arCount;
        int a[] = new int[ara];
        int result = 0;
        for(int i =0; i< ara; i++)
        {
            a[i] = ar[i];
            result = result + a[i];
        }
        return result;
    }
   
    public static void main(String[] args)
    {
        int arCount = 6;
        int[] ar = {1 ,2 ,3 ,4 ,10, 11};
        int result = simpleArraySum(arCount,ar);
        System.out.print(result);
    }
}

