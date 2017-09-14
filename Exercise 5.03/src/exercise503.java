
import java.util.Scanner;

public class exercise503 
{
	public static void main (String[] args)
	{
		 
		Scanner keyboard = new Scanner(System.in);
				
		int number;	
		System.out.println("Enter a number 10 to 25: ");
		
		while (true)
			{
				number = keyboard.nextInt();
		
				if (number >= 10 && number <= 25)
					{
						System.out.println("CORRECT NUMBER");
					}
				else
					{
						System.out.println("INCORRECT NUMBER");
					}
		
			}
		
	} 
		
}