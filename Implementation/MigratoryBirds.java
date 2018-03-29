//		You have been asked to help study the population of birds migrating across 
//		the continent. Each type of bird you are interested in will be identified by
//		an integer value. Each time a particular kind of bird is spotted, its id 
//		number will be added to your array of sightings. You would like to be able
//		to find out which type of bird is most common given a list of sightings. 
//		Your task is to print the type number of that bird and if two or more types 
//		of birds are equally common, choose the type with the smallest ID number.


package Implementation;

public class MigratoryBirds {

	static int migratoryBirds(int n, int[] ar) 
	{
		int a = 0;
		int count[] = {0,0,0,0,0};
		for(int i = 0; i < ar.length ;i++ )
		{
			for(int j = 0 ; j < count.length ; j++)
			{
				if(ar[i] == j + 1)
				{
					count[j]++;
				}
					
			}
		}
		
		int biggest = count[0];
		for(int i = 0; i < count.length ; i++)
		{
			if(count[i] > biggest )
			{
				biggest = count[i];
				a = (i+1);
			}
		}
		return a;
    }

    public static void main(String[] args) {
        
        int n = 6;
        int[] ar ={1, 4, 4, 4, 5, 3};
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
	
}
