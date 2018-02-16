import java.util.Scanner;

public class Loops {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		Loops(num);

	}

	private static void Loops(int num)
	{
		int total;
		String result;
		for(int i = 1; i <= 10; i++)
		{
			total = num * i;
			result = num + " x " + i + " = " + total;
			System.out.println(result);
		}
		//System.out.println(result);
		
	}

}
