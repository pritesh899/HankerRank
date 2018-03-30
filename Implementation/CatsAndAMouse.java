package Implementation;

public class CatsAndAMouse 
{
	static String catAndMouse(int x, int y, int z ) 
	{
       int c1 = Math.abs(z - x);
       int c2 = Math.abs(z - y);
       String result = "";
       if(c1 < c2)
       {
    	   result = "Cat A";
       }else if(c1 > c2)
       {
    	   result = "Cat B";
       }else if(c1 == c2)
       {
    	   result = "Mouse C";
       }
		return result;
    }
	
    public static void main(String[] args) 
    {
    	int q = 2;
        int x = 1;
        int y = 3;
        int z = 2;
        String result = catAndMouse(x, y, z);
        System.out.print(result);  
    }
}
