//Given a square matrix, calculate the absolute difference between the sums of its diagonals.

public class DiagonalDifference 
{
	static int diagonalDifference(int n,int[][] a) 
	{
        
        int nn = n;
        int [][]aa = new int[nn][nn];
        for(int i= 0; i< nn; i++)
        {
            for(int j=0; j< nn ;j++)
            {
                aa[i][j] = a[i][j];
            }
        }
        int D1 = 0, D2 = 0;
        for(int i = 0; i <nn ; i++)
        {
            
                D1 = D1 + aa[i][i];
            
        }
        
        for (int i = 0, j = (nn-1); i < nn && j >= 0; i++ , j--)
        {
              D2 = D2 + aa[i][j];
        }
        
        int Result = Math.abs(D1 - D2);
        return Result;
    }

    public static void main(String[] args) 
    {

        int n = 3;
        int[][] a = {{11,2,4},
        			 {4,5,6},
        			 {10,8,-12}};
        
        int result = diagonalDifference(n,a);
        System.out.print(result);
    }
}

