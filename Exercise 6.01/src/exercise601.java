
import java.util.Scanner;

public class exercise601 
{
	public static void main (String[] args)
	{	
		Scanner keyboard = new Scanner(System.in);
		int[] number;
		number = new int[10];
		System.out.println("Enter 10 numbers: ");
		for (int i = 0; i< number.length; i++)
		{
			number[i] = keyboard.nextInt();
		}
		for (int i = number.length-1; i >= 0; i--)
		{
			System.out.print(number[i] + " ");
		}
		
			
	}
}
