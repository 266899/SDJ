import java.util.Scanner;
import java.util.ArrayList;

public class exercise806 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		String name = "a";
		
		System.out.println("Enter some strings(quit to terminate): ");
		
		while (!(name.equals("quit")))
		{
			name = keyboard.nextLine();
			if (name.equals("quit"))
			{
				break;
			}
			else
			{
				list.add(name);
			}
		}
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		
		
		
		
	}
}
