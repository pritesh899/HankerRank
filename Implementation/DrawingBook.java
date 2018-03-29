//		Brie’s Drawing teacher asks her class to open their n-page book to page number p.
//		Brie can either start turning pages from the front of the book (i.e., page number 1) 
//		or from the back of the book (i.e., page number ), and she always turns pages 
//		one-by-one (as opposed to skipping through multiple pages at once). 
//		When she opens the book, page 1 is always on the right side:


package Implementation;

public class DrawingBook {
	static int solve(int n, int p)
	{
		int pageFront= (int)Math.floor(p/2);
		int pageBack = (int)Math.floor((n/2)-(p/2));
		
		if(pageFront < pageBack)
		{
			return pageFront;
		}else{
			return pageBack;
		}	
    }
	
	public static void main(String[] args)
	{ 
	        int n = 6;
	        int p = 2;
	        int result = solve(n, p);
	        System.out.println(result);
	}
}
