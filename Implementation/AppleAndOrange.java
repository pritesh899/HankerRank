//	Sam's house has an apple tree and an orange tree that yield an abundance of fruit.
//	Sam’s two children, Larry and Rob, decide to play a game in which they each climb 
//	a tree and throw fruit at their (Sam’s) house. Each fruit that lands on the house 
//	scores one point for the one who threw it. 
//	Larry climbs the tree on the left (the apple), and Rob climbs the one on the 
//	right (the orange).


package Implementation;

public class AppleAndOrange 
{
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges)
    {
    	int larryScore = 0, robScore = 0;
    	for(int i= 0;i<apples.length;i++)
    	{	
    		int temp = 0;
    		temp = apples[i];
    		int throw1 =  temp + a;
    		if(throw1 >= s && throw1 <=t)
    		{
    			larryScore++;
    		}
    	}
    	for(int i= 0;i<oranges.length;i++)
    	{
    		int temp1 = 0;
    		temp1 = oranges[i];
    		int throw1 =  temp1 + a;
    		if(throw1 >= s && throw1 <=t)
    		{
    			robScore++;
    		}
    	}
    	System.out.println(larryScore);
    	System.out.println(robScore);

    }

    public static void main(String[] args) {


        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        int m = 3;
        int n = 2;
        int[] apple = {-2,2,1};
        int[] orange = {5,-6};

        countApplesAndOranges(s, t, a, b, apple, orange);
    }
}


