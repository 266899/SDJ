import java.util.Scanner;  //Needed for Scanner class

public class Payroll 
{

	public static void main(String[] args) 
	{
		String name;
		int hours;
		double payRate;
		double grossPay;
		
		//create a scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		
		//Get the users name.
		System.out.println("What is your name? ");
		name = keyboard.nextLine();
		
		//get the number of hours worked this week.
		System.out.println("How many hours did your work this week? ");
		hours = keyboard.nextInt();
		
		//Get the user's hourly pay rate.
		System.out.println("What is your hourly pay rate? ");
		payRate = keyboard.nextDouble();
		
		//closing the keyboard
		keyboard.close();
		
		//Calculate the gross pay.
		grossPay = hours * payRate;
		
		//Display the resulting information
		System.out.println("Hello " + name);
		System.out.println("Your gross pay is $" + grossPay);
	}

}
