import java.util.Scanner;

public class Person {
	
	int age;
	String token;

	public Person(int initialAge)
	{
		if(initialAge < 0)
		{
			age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
		else
		{
			age = initialAge;
		}
		
	}
	private void amIOld()
	{
		if(age < 13)
		{
			token = "You are young.";
		}
		else if(age >=13&& age < 18)
		{
			token = "You are a teenager.";
		}
		else
		{
			token = "You are old";
		}
		System.out.println(token);
		
		
	}
	private void yearPasses()
	{
		age++;
		
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for(int i = 0; i < T; i++)
		{
			int age = input.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for(int j = 0; i < 3; j++)
			{
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
			
		}
		input.close();

	}
	

	
}
