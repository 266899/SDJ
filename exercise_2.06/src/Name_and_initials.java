import java.util.Scanner;

public class Name_and_initials 
{
	public static void main (String[] args)
	{
		String firstName;
		String middleName;
		String lastName;
		char firstInitial, middleInitial, lastInitial;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your first name? ");
		firstName = keyboard.nextLine();
		
		System.out.println("What is your middle name? ");
		middleName = keyboard.nextLine();
		
		System.out.println("What is your last name? ");
		lastName = keyboard.nextLine();
			
		firstInitial = firstName.charAt(0);
		middleInitial = middleName.charAt(0);
		lastInitial = lastName.charAt(0);
		
		System.out.println("Your full name is: "+ firstName + " " 
								+ middleName + " " + lastName);
	
		System.out.println("Your initials are: " + firstInitial + middleInitial + lastInitial);
	}
}
