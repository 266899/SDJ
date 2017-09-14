import java.util.Scanner;
public class PrintSum 
{
	public static void main (String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		int number = 5;
		double sum = 0, value;
		
		System.out.println("Type 5 numbers: ");
		
		for (int i=1; i<=number; i++)
		{
			value = keyboard.nextDouble();
			sum = sum + value;
		}
		System.out.println("Sum: " + sum);
		
		double average = sum/number;
		
		System.out.println("Average: " + average);
	}
}
