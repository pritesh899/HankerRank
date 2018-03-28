//	Maria plays college basketball and wants to go pro. Each season she maintains
//	a record of her play. She tabulates the number of times she breaks her season 
//	record for most points and least points in a game. Points scored in the first
//	game establish her record for the season, and she begins counting from there.

package Implementation;

public class BreakingTheRecords 
{
    static int[] breakingRecords(int[] score) 
    {
    	int results[] = {0,0};
    	
    	int [] high = new int [score.length];
    	int [] low = new int [score.length];
    	
    	high[0] = score[0];
    	low[0] = score[0];
    	
    	for(int i = 0; i< score.length-1;i++)
    	{
	    	if(score[i+1]>high[i])
	    	{
	    		high[i+1] = score[i+1];
	    		results[0]++;
	    	}else
	    	{
	    		high[i+1] = high[i];
	    	}
    	}
    	for(int i = 0; i< score.length-1;i++)
    	{
	    	if(score[i+1]<low[i])
	    	{
	    		low[i+1] = score[i+1];
	    		results[1]++;
	    	}else
	    	{
	    		low[i+1] = low[i];
	    	}
    	}
        
    	return results;
    }

    public static void main(String[] args)  {

        int[] score = {3 ,4 ,21 ,36 ,10 ,28 ,35, 5 ,24 ,42};
        //int[] score = {10 ,5 ,20 ,20 ,4 ,5, 2, 25, 1};
        int[] result = breakingRecords(score);
        System.out.println(result[0]);
        System.out.println(result[1]);
        
    }
}

