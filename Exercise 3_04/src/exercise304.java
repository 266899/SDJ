
import java.util.Scanner;

public class exercise304 
{
	public static void main (String[] args)
	{
		Scanner keyboard =new Scanner(System.in);
				
		System.out.println("First number: ");
		int first = keyboard.nextInt();
		
		System.out.println("Second number: ");
		int second = keyboard.nextInt();
		
		if(first>second)
		{
			System.out.println(second + " " + first);
		}
		else 
		{
			System.out.println(first + " " + second);
		}
		
		int sum = first+second;
		System.out.println("Sum is: " + sum);
		
			if (second !=0)
				{
					double divided=first/second;
					System.out.println("Division: " + divided);
				}
				else
					{
						System.out.println("Cannot divide by 0");
					}
		
						if (second !=0)
							{
								double modulus=first%second;
								System.out.println("Modulus: " + modulus);
							}
							else
								{
									System.out.println("Cannot divide by 0");
								}
	}
}
