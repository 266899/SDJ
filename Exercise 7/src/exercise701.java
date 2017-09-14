 import java.util.Scanner;
public class exercise701 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int[] array1;
		array1 = new int[4];
		int [] array2;
		array2 = new int[4];
		int[] sumArray;
		sumArray = new int[4];
		
		for (int i=0; i< array1.length; i++)
		{
			System.out.print("array1 numbers: " );
			array1[i] = keyboard.nextInt();
		}
		
		for (int i=0; i< array1.length; i++)
		{
			System.out.print("array2 numbers: ");
			array2[i] = keyboard.nextInt();
		}
		
		for (int i=0; i< array1.length; i++)
		{
			sumArray[i] = array1[i] + array2[i];
		}
		System.out.print("Sum of array: {");
		for (int i=0; i< array1.length; i++)
		{
			System.out.print( sumArray[i] + " " );
		}
		System.out.print("}");
	}
}
