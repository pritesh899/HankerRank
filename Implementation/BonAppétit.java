package Implementation;

public class BonAppétit {

	public static void main(String[] args) {
		int n = 4;
		int k = 1;
		int []c = {3,10,2,9};
		int b = 12;
		int sum =0;
		for(int i =0 ;i< n;i++)
		{
			if(i !=k)
			{
				sum = sum + c[i];
			}
		}
		int perPersonCost = sum /2;
		if(perPersonCost == b)
		{
			System.out.println("Bon Appetit");
		}else
		{
			System.out.print(b - perPersonCost);
		}

	}

}
