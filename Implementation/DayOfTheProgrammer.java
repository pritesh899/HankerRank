//256th day of the programmer according to the julian and geogorian calender

package Implementation;

public class DayOfTheProgrammer {

	static String solve(int year)
	{
		int day = 0;
		int month = 9;
		
		
		 if (year == 1918)
		 {
		        day = 26;
		 }else if (((year <= 1917) && (year%4 == 0)) || ((year > 1918) && (year%400 == 0 || ((year%4 == 0) && (year%100 != 0)))))
		 { day =12;
			} else{
		        day = 13;
			}
		String date = ""+day+".0"+month+"."+year+"";
		return date;
	}

    public static void main(String[] args)
    {
        int year = 2017;
        String result = solve(year);
        System.out.println(result);
    }

}
