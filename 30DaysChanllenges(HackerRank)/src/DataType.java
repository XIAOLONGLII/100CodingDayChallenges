import java.util.Scanner;

//Day1
public class DataType
{

	private static Scanner input;

	public static void main(String[] args)
	{
		int i = 4;
		double d = 4.0;
		String s = "Hackerrank";
		
		result(i,d,s);
		

	}

	private static void result(int i, double d, String s )
	{
		input = new Scanner(System.in);
		System.out.println("Type those infor: ");
		int i1 = input.nextInt();
		double d1 = input.nextDouble();
		input.nextLine();
		String s1 = input.nextLine();
		
		System.out.println(i1 + i + "\n" + (d1 + d) + "\n" + s + s1);

	}

}
