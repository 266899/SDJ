
import java.util.Scanner;

public class exercise403
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
	
	if (month <=0 || month > 12)
	{
		System.out.println("Illegal date");
	}
	
	else if (day <=0 || day > 31)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 2 && day <=0)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 2 && day > 28)
	{
	System.out.println("Illegal date");
	}
	
	else if (month == 4 && day <=0)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 4 && day > 30)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 6 && day <=0)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 6 && day > 30)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 9 && day <=0)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 9 && day > 30)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 11 && day <=0)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 11 && day >30)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 1 && day <=0)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 1 && day > 31)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 3 && day <=0)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 3 && day > 31)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 5 && day <=0)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 5 && day > 31)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 7 && day <=0)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 7 && day > 31)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 8 && day <=0)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 8 && day > 31)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 10 && day <=0)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 10 && day > 31)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 12 && day <=0)
	{
		System.out.println("Illegal date");
	}
	
	else if (month == 12 && day > 31)
	{
		System.out.println("Illegal date");
	}
	
	else
	{
		System.out.println(day + "/" + month + "/" + year);
	}
	
	} 
}