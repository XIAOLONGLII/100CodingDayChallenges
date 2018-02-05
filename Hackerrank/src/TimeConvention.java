import java.util.Scanner;

/*
 * Given a time in -hour AM/PM format, convert it to military (-hour) time.

Note: Midnight is  on a -hour clock, and  on a -hour clock. Noon is  on a -hour clock, and  on a -hour clock.

Input Format

A single string containing a time in -hour clock format (i.e.:  or ), where  and .

Output Format

Convert and print the given time in -hour format, where .

Sample Input

07:05:45PM


Sample Output

19:05:45
 * 
 * 
 */
public class TimeConvention {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a time ");
		String s = input.next();
		timeConversion(s);
		String result = timeConversion(s);
		System.out.println(result);
		
		

	}
	
	

	private static String timeConversion(String s)
	{
		// step 1: AM and PM 
		
		// step 2: if AM don't have to change anything get rid of "AM", if 12AM has to change to "00"
		
		//step 3 : if PM, clock + 12, if 12PM then don't change anything 
		
		
		String firstTwo = s.substring(0,2);
		String lastTwo = s.substring(s.length() - 2);
		String middle = s.substring(2, s.length()-2);
		String clock = " ";
		
		
		if(lastTwo.equals("AM") )
		{
			if(firstTwo.equals("12"))
			{
				clock = "00" + middle;
			}
			else
			{
				clock = firstTwo + middle;
			}
		}
		else
		{
			if(firstTwo.equals("12"))
			{
				clock = firstTwo + middle;
			}
			else
			{
				int time = Integer.parseInt(firstTwo);
                int time1 = time + 12;
                String time2 = Integer.toString(time1); 
                clock = time2 + middle;
			}
		}
		
		return clock;
		//System.out.println(clock);
	}

}
