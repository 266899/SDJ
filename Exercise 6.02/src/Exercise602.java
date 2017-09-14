import java.util.Scanner;

public class Exercise602 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		double[] number;
		number = new double[7];
		int x = 0;
		double smallest = 0;
		
		for (int i = 0; i< number.length; i++)
			{
				number[i] = keyboard.nextDouble();
			}
		double buffer = 0;
		buffer = number[0];
		for (int i = 0; i < number.length; i++)
		{
			if (buffer > number[i])
			{
			buffer=number[i]; 
			}
		}
			
		System.out.println(buffer);
	}
}
