//	Colleen is having a birthday! She will have a cake with one candle for 
//	each year of her age. When she blows out the candles, she’ll only be 
//able to blow out the tallest ones.
//	
//	Find and print the number of candles she can successfully blow out.

public class BirthdayCakeCandles
{
    static int birthdayCakeCandles(int n, int[] ar) 
    {
        long biggest = ar[0];
        int result = 0;
        for(int i = 0;i<n;i++)
        {
            if(ar[i]>biggest)
            {
                biggest = ar[i];
                System.out.println(biggest);   
            }  
        }
        for(int i = 0;i<n;i++)
        {
            if(ar[i]==biggest)
            {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) 
    {

        int n = 4;
        int[] ar = {3 ,2 ,1 ,3};
        int result = birthdayCakeCandles(n, ar);
        System.out.print(result);
    }
}

