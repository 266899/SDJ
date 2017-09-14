
	import java.util.Scanner;
public class exercise506 
{
 public static void main (String[] args)
 {
	 int integer, count = 0;
	 Scanner keyboard = new Scanner(System.in);
	
	while (true)
	{
		System.out.println("Enter a number(-1 ends the cycle): ");
		integer = keyboard.nextInt();
		count ++;
		if (integer == -1)
		{
			break;
		}
	}
	System.out.println("Entered amount of numbers: " + count--);
 }
 
}
