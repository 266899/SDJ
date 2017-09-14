
import java.util.Scanner;

public class Gender_test
{
public static void main(String[] args)
{
	int age;
	Scanner input = new Scanner(System.in);
		System.out.print("Type gender (M or F): ");
	String line = input.nextLine();
	
	char gender = line.charAt(0);
	
	System.out.println("Type your age: ");
	age = input.nextInt();
	
		if (gender == 'M' && age >=18)
			{
				System.out.print("Man");
			}
			else if (gender == 'M' && age < 18)
				{
					System.out.println("Boy");
				}
			else if (gender != 'M' && age>=18)
			{
				System.out.println("Woman");
			}
		
			else if (gender != 'M' && age < 18)
			{
				System.out.println("Girl");
			}
	} 
}