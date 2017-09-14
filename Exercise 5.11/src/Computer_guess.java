import java.util.Scanner;
import java.util.Random;

public class Computer_guess 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Random Random = new Random();
		int number = Random.nextInt(1024) +1;
		boolean belekas = true;
		int a = 1024;
		int b = 1;
		int guess = 0;
		int count;
		int yesNo;
		System.out.println("1 for lower/ 2 for higher / 0 for correct");
		
		while (belekas = true)
		{
			count++;
			Random = Random.nextInt(a);
			int number1 = Random.nextInt(a-b) + 1 + b;
			System.out.println(number1);,,
			yesNo = keyboard.nextInt();
			if (yesNo == 1)
			{
				guess = a;
			}
			else if (yesNo == 2)
			{
				guess = b;
			}
			else if (yesNo == 0)
			{
				System.out.println("It took: " + count-- + " tries");
				belekas = false;
			}
			else 
			{
				System.out.println("error");
			}
		}
	}
}
