import java.util.Scanner;
public class exercise708 
{
	public static void main (String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	int[] x;
	x = new int[10];
	int start = 0;
	
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
	int smallestNr = start;
	int smallest = x[0];
	
	for (int i = 0; i< x.length; i++)
	{
		if (smallest > x[i])
		{
			smallest = x[i];
			smallestNr = i;
		}
	}
	
	x[start] = x[smallest];
	x[smallestNr] = x[start];
	
	System.out.println();
	for (int i = 0; i < x.length; i++) 
	{
		System.out.print(x[i] + " ");
	}
	
	

	
	
	
	
	
	
	
	
	}
}
