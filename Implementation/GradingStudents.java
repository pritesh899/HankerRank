//		At HackerLand University, a passing grade is any grade 40 points or higher on
//		a 100 point scale. Sam is a professor at the university and likes to round 
//		each student’s grade according to the following rules:
//		
//		If the difference between the grade and the next higher multiple of
//		5 is less than 3, round to the next higher multiple of 5
//
//		If the grade is less than 38, don’t bother as it’s still a failing grade.
//		Automate the rounding process then round a list of grades and print the results.

package Implementation;
public class GradingStudents 
{
    public static int[] gradingStudents(int n, int[] grades) 
    {
    	for(int i =0; i< n;i++)
    	{
			int grade = grades[i];
			int divideByFive = grade/5;
			int plusOne = divideByFive + 1;
			int newGrade = plusOne * 5;
			int difference = newGrade - grade;
			if(difference<3 && grade >= 38)
			{
				grades[i] = newGrade;
			}
		}
    	return grades;
    }

    public static void main(String[] args)  
    {
        int n = 4;
        int[] grades ={73,67,38,33};
        int[] result = gradingStudents(n,grades);
        for(int i =0 ;i < n;i++)
        {
        	System.out.println("Grade "+i+ ":" +result[i]);
        }
    }
}

