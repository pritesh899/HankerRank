package Implementation;

public class ElectronicsShop {
	static int getMoneySpent(int[] keyboards, int[] drives, int s,int n, int m){
		int count = 0;
		int count2 = 0;
		int possibilities[] = new int[keyboards.length * drives.length];
		for(int i = 0; i< keyboards.length;i++)
		{
			for(int j = 0; j< drives.length ;j++)
			{
				if(drives[j] + keyboards[i] <= s)
				{
					possibilities[count] =   drives[j] + keyboards[i];
					count++;
				}else{
					count2++;
				}
			}
		}
		int result = 0;
		if(count2 == keyboards.length * drives.length)
		{
			result = -1;
		}else{
			result = possibilities[0];
			for(int i =0 ; i< possibilities.length;i++)
			{
				if(result < possibilities[i] && possibilities[i] <= s)
				{
					result = possibilities[i];
				}
			}
		}
		return result;
    }

    public static void main(String[] args) {
       
        int s = 5;
        int n = 1;
        int m = 1;
        int[] keyboards = {4};
        
        int[] drives = {5};

        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s,n,m);
        System.out.println(moneySpent);
    }
}
