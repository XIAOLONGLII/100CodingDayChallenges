import java.util.Scanner;

/*
 * If  is odd, print Weird
	If  is even and in the inclusive range of 2 to 5 , print Not Weird
	If  is even and in the inclusive range of  6 to 20, print Weird
	If  is even and greater than 20 , print Not Weird
 */
public class EvenOdd {

	private static Scanner input;
	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		int num = input.nextInt();	
		result(num);
	}

	private static void result(int num)
	{
		if((num % 2 != 0) || ((num % 2 == 0) && num >= 6 && num <= 20))
		{
			System.out.println("Weired");
		}
		else if ((num % 2 ==0) && ((num >= 2 && num <= 5) || num > 20))
		{
			System.out.println("Not weired");
		}
		
	}

}
