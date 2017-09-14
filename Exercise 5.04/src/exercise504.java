
	import java.util.Scanner;
public class exercise504 
{
 public static void main (String[] args)
 {
	 Scanner keyboard = new Scanner(System.in);
	int number = 6, length = 0;
	System.out.println("Input 6 words: ");
	for (int i = 0; i < number; i++)
	{
		String word = keyboard.nextLine();
		length = length + word.length();
	}
	 System.out.println("Total characters: " + length);
 }
}
