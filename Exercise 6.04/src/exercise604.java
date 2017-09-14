import java.util.Scanner;
public class exercise604 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int [] numbers;
		numbers = new int[5];
		int biggest = 0;
		int second = 0;
		int biggestNr = 0;
		
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = keyboard.nextInt();
		}
		
		biggest = numbers[0];
		
		for (int i = 0; i < numbers.length; i++)
		{
			if (biggest < numbers[i])
			{
			biggest = numbers[i]; 
			biggestNr = i;
			}
		}

		second = numbers[0];
		
		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] < biggest && numbers[i] > second)
			{
			second = numbers[i]; 
			}
		}
		System.out.println("2nd biggest: " + second);
	}
}