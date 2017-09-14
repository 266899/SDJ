
import java.util.Scanner;

public class exercise402
{
public static void main(String[] args)
{
	Scanner keyboard = new Scanner(System.in);
		
	int day, month, year;
	
	System.out.println("Enter day: ");
	day = keyboard.nextInt();
	
	System.out.println("Enter month: ");
	month = keyboard.nextInt();
	
	System.out.println("Enter year: ");
	year = keyboard.nextInt();
	
	System.out.println(day + "/" + month + "/" + year);
	
	} 
}