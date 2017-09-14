package t1;
import java.util.Scanner;

public class t3 
{
	public static void main (String[] args) {
	
		Scanner keyboard = new Scanner (System.in);
		int [] array;
		array = new int [5];
		int [] occurance;
		occurance = new int[5];
		System.out.println("Enter 5 integers: ");
		for (int i = 0; i< array.length; i++)
		{
			array[i] = keyboard.nextInt();
		}
		int smallest = array[0];
		
		
		for (int i = 0; i< array.length; i++)
		{
			if (smallest > array[i])
			{
				smallest = array[i];
			}
		}
		System.out.println("Smallest number: " + smallest);
		
		int count = 0;
		for (int i = 0; i< array.length; i++)
		{
			if (array[i]/10 >=1 && array[i]/10 <=9)
			{
				count++;
			}
		}
		System.out.println("Two digit number count: " + count);
		
		for (int i = 0; i< array.length; i++)
		{
			for (int j = 0; j< array.length; j++)
			{
				if (array[i] == array[j])
			{
				occurance[i]++;
			}
			}
		}
		System.out.println();
		for (int i = 0; i< array.length; i++)
		{
			System.out.println("Number " + array[i] + " occurs " + occurance[i] + " times");
		}
	}
	
}
