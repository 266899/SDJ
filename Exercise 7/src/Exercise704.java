 import java.util.ArrayList;
import java.util.Scanner;
public class Exercise704 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		System.out.println("Enter 7 Strings: ");
		
		for (int i=0; i < 7; i++)
		{
			list.add(keyboard.nextLine());
		}
		
			for (int i=0; i < 7; i++)
			{
				System.out.println(list.get(i) + " ");		
			}
		
		System.out.println("Enter an index");
			int newIndex = keyboard.nextInt();
			keyboard.nextLine();
		
		System.out.println("Enter a word");
		
			String newString = keyboard.nextLine();
		
		list.add(newIndex, newString);
		
		System.out.println();
		
			for (int i = 0; i < 8; i++) 
			{
				System.out.println(list.get(i) + " ");
			}
	}
}

