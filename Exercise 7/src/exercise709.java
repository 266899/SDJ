import java.util.Scanner;
public class exercise709 
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
	
	for (int start = 0; start < x.length-1; start++)
	{
		if (smallest > x[start])
		{
			smallest = x[start];
			smallestNr = start;
		}
		System.out.print(x[start] + " ");
	}

	
	
	
	
	
	
	
	}
}
