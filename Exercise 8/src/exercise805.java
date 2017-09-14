import java.util.Scanner;
import java.util.ArrayList;

public class exercise805
{
	public static void main (String[] args)
	{
		int positiveCount = 0;
		int negativeCount = 0;
		int random = 0;
		int count = 0;
		int largest = 0;
		int smallest = 0;
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Integer> positive = new ArrayList<>();
		ArrayList<Integer> negative = new ArrayList<>();
		
		System.out.println("Enter integers(0 to terminate): ");
				
		while (true)
		{
			count++;
			random = keyboard.nextInt();
			if (random > 0)
			{
				positive.add(random);
				positiveCount++;
			}
			
				else if (random < 0)
				{
					negative.add(random);
					negativeCount++;
				}
					else if (random == 0) {
						break;
					}
			
			if (largest < random)
			{
				largest = random;
			}
			if (smallest > random)
			{
				smallest = random;
			}
		}
		System.out.println(positiveCount + " positive numbers and " + negativeCount + " negative. Largest = " +largest + " smallest = " +smallest);
		
	}
}
