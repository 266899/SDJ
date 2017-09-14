 import java.util.Scanner;
public class Exercise703
{
	public static void main (String[] args)
	{
		int remove = 0;
		Scanner keyboard = new Scanner(System.in);
		String[] array = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"}; 
		
		for (int i=0; i < array.length; i++)
		{
			System.out.print(array[i] + " | ");
		}
		System.out.println();
		System.out.println("Enter a number to remove(0-9): ");
		remove = keyboard.nextInt();
		
		for (int i=0; i < remove; i++)
		{
			System.out.print(array[i] + " ");
		}	
		//not finished
	}
}
