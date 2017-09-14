import java.util.Scanner;
public class exercise707 
{
	public static void main (String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	int[] x;
	x = new int[10];
	System.out.println("Enter 10 integers: ");
	for (int i = 0; i < x.length; i++) 
	{
		x[i] = keyboard.nextInt();
	}
	
	for (int i = 0; i < x.length; i++) 
	{
		System.out.print(x[i] + " ");
	}
	System.out.println();
	int smallestNr = 0;
	int smallest = x[0];
	
	for (int i = 0; i< x.length; i++)
	{
		if (smallest > x[i])
		{
			smallest = x[i];
			smallestNr = i;
		}
	}
	
	x[0] = x[smallest];
	x[smallestNr] = x[0];

	for (int i = 0; i < x.length; i++) 
	{
		System.out.print(x[i] + " ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
