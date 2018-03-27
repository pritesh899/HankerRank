//Finding the largest and smallest number in array

public class LargestSmallestNumberInArray {

	public static void main(String[] args) {
		int ar[] = new int[100];
		for(int i =1; i<=50; i++)
		{
			ar[i] = i;
		}
		int biggest = ar[0];
		int smallest = ar[0];
		for(int i = 0; i< ar.length -1;i++)
		{
			if(ar[i]>biggest)
			{
				biggest = ar[i];
			}else if(ar[i]<smallest)
			{
				smallest = ar[i];
			}
			
		}
		System.out.println("Biggest :"+biggest);
		System.out.println("Smallest :"+smallest);
	}

}
