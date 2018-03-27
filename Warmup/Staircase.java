//	Write a program that prints a staircase of size .
//	
//	Input Format:
//	A single integer, , denoting the size of the staircase.
//	
//	Output Format:
//	Print a staircase of size  using # symbols and spaces.
//	
//	Note: The last line must have  spaces in it.

//                   #
//				    ##
//				   ###
//				  ####
//				 #####
//				######

public class Staircase
{

	public static void main(String[] args)
	{
		int n = 6;
		staircase(n) ;
	}
	static void staircase(int n) 
    {
		int i , j;
		for(i = 0 ; i <= n; i ++)
		{
			for(j = 0; j<= n;j++)
			{
				if(j <= n && j >= n -i)
				{
					System.out.print("#");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
    }
}
