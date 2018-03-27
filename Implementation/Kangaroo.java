//	Given the starting locations and jump distances for each kangaroo, 
//	determine if and when they will land at the same location at the same time.


package Implementation;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) 
    {
		String result = "";
		for(int i =0 ;i< 10000;i++)
		{
			x1 = x1 + v1;
	    	x2 = x2 + v2;
	    	if(x1 == x2)
	    	{
	    		result = "YES";
	    		break;
	    	}else {
	    		result = "NO";
	    	}
	    	
		}
		return result;
    }

    public static void main(String[] args) {
        int x1 = 0;
        int v1 = 2;
        int x2 = 5;
        int v2 = 3;
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}