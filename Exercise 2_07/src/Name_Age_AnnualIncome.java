import java.util.Scanner;

public class Name_Age_AnnualIncome 
{
	public static void main (String[] args)
	{
		String name;
		int age;
		double annualPay;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Name: ");
		name = keyboard.nextLine();
		
		System.out.println("Age : ");
		age = keyboard.nextInt();
		
		System.out.println("Annual pay: $");
		annualPay = keyboard.nextDouble();
		
		System.out.println("My name is " + name + "," + " my age is " + age + " and");
		System.out.println("I hope to earn $" + annualPay + " per year.");
		
	}
}
