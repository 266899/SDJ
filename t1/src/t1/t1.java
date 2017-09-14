package t1;
import java.util.Scanner;
public class t1 
{
	public static void main (String[] args) {
		int number = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		number = keyboard.nextInt();
		if (number > 0)
		{
			System.out.println(Math.floorMod(number, 10));
		}
		else if (number< 0)
		{
			System.out.println((Math.abs(number) %10));
		}
	}
	
	}
