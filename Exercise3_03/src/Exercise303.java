import java.util.Scanner;
public class Exercise303 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("First number: ");
		int first = input.nextInt();
		
		System.out.println("Second number: ");
		int second = input.nextInt();
		
		System.out.println("Third number: ");
		int third = input.nextInt();
		
		int sum=first+second+third;
		
		System.out.println("Sum is: " + sum);

	}
}
