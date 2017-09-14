import java.util.Scanner;
public class exercise306 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int first = keyboard.nextInt();
		int second = keyboard.nextInt();
		int third = keyboard.nextInt();
		
		if (first > second && second > third)
		{
			System.out.println("Your numbers: " + first + " " + second + " " + third);
		}
		
		else if (first > second && first > third && second < third)
		{
			System.out.println("Your numbers: " + first + " " + third + " " + second);
		}
		
		else if (second > first && first > third)
		{ 
			System.out.println("Your numbers: " + second + " " + first + " " + third);
		}
		
		else if (second > first && second > third && first < third)
		{
			System.out.println("Your numbers: " + second + " " + third + " " + first);
		}
		
		else if (third > first && third > second && first > second)
		{
			System.out.println("Your numbers: " + third + " " + first + " " + second);
		}
		
		else if (third > second && third > first && first < second)
		{
			System.out.println("Your numbers: " + third + " " + second + " " + first);
		}
		
//		else if (first == second && first == third )
//		{
//			System.out.println("Your numbers: " + first + " " + second + " " + third);
//		}
//		
//		else if (first == second && third > first)
//		{
//			System.out.println("Your numbers: " + third + " " + second + " " + first);
//		}
//		
//		else if (first == second && third < first)
//		{
//			System.out.println("Your numbers: " + first + " " + second + " " + third);
//		}
//		
//		else if (second == third && second > first)
//		{
//			System.out.println("Your numbers: " + second + " " + third + " " + first);
//		}
//		
//		else if (second == third && second < first)														// allowing similar numbers
//		{
//			System.out.println("Your numbers: " + first + " " + third + " " + second);
//		}
//		
//		else if (first == third && second > first)
//		{
//			System.out.println("Your numbers: " + second + " " + third + " " + first);
//		}
//		
//		else if (first == third && second < first)
//		{
//			System.out.println("Your numbers: " + first + " " + third + " " + second);
//		}
		
		else if (first == third || first == second || second == third)
		{
			System.out.println("2 or more of your numbers are similar");								//Not allowing similar numbers
		}
	}
}
