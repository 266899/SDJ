import java.util.Scanner;
public class exercise603 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int [] numbers;
		numbers = new int[5];
		double sum= 0;
		double average = 0;
		double smallest = 0;
		double biggest = 0;
		for (int i=0; i< numbers.length; i++)
		{
			numbers[i] = keyboard.nextInt();
		}
		
		for (int i = 0; i < numbers.length; i++)
		{
			sum += numbers[i];
			average = sum / numbers.length;
		}
		
		smallest = numbers[0];
		
		for (int i = 0; i < numbers.length; i++)
		{
			if (smallest > numbers[i])
			{
			smallest = numbers[i]; 
			}
		}
		biggest = numbers[0];
			
			for (int i = 0; i < numbers.length; i++)
			{
				if (biggest < numbers[i])
				{
				biggest = numbers[i]; 
				}
			}
		
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
		System.out.println("Smallest " + smallest);
		System.out.println("Biggest " + biggest);
		}
}
