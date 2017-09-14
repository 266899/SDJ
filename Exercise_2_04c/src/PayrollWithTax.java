import java.util.Scanner;  //Needed for Scanner class

public class PayrollWithTax 
{

	public static void main(String[] args) 
	{
		String name;
		int hours;
		double payRate;
		double grossPay;
		double taxRate;
		double netPay;
		
		//create a scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		
		//Get the users name.
		System.out.println("What is your name? ");
		name = keyboard.nextLine();
		
		//get the number of hours worked this week.
		System.out.println("How many hours did your work this week? ");
		hours = keyboard.nextInt();
		
		System.out.println("What is your tax rate? ");
		taxRate = keyboard.nextDouble();
		
		//Get the user's hourly pay rate.
		System.out.println("What is your hourly pay rate? ");
		payRate = keyboard.nextDouble();
		
		//Calculate the gross pay.
		netPay = hours * payRate*taxRate;
		
		
		//Display the resulting information
		System.out.println("Hello " + name);
		System.out.println("Your net pay is $" + netPay);
	}

}
