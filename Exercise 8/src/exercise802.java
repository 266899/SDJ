import java.util.ArrayList;
import java.util.Scanner;
public class exercise802 
{

	public static void main (String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Enter 4 positive integers: ");
		
		for (int i = 0; i < 4; i++) {
			list.add(keyboard.nextInt());
		}
		int largest = list.get(0);			//finding largest number and index
		int largestNr = 0;
		for (int i = 0; i<4; i++) {
			if (largest < list.get(i))
			{
				largest = list.get(i);
				largestNr = i;
			}
		}
		System.out.println("Largest element: " + largest + " and it's number: " + largestNr );
	}
}
