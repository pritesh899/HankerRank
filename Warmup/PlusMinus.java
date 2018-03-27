//Given an array of integers, calculate the fractions of its elements that 
//are positive, negative, and are zeros. Print the decimal value of each 
//fraction on a new line.
public class PlusMinus {
	
		public static void plusMinus(int n,int[] arr) {
	        
	        int nn = n;
	        double negative =0 , positive = 0, zero = 0;
	        int ar[] = new int[nn];
	        for(int i= 0 ;i< nn;i++)
	        {
	            ar[i] = arr[i];
	            if(ar[i] < 0)
	            {
	                negative = negative + 1;
	            }else if(ar[i] == 0)
	            {
	                zero = zero + 1;
	            }else{
	                positive = positive +1;
	            }
	        }
	        
	        System.out.println(positive/nn);
	        System.out.println(negative/nn);
	        System.out.println(zero/nn);
	   }


	    public static void main(String[] args) 
	    {
	        int n = 6;

	        int[] arr = {-4, 3, -9, 0, 4, 1 };

	        plusMinus(n,arr);
	    }
	}




