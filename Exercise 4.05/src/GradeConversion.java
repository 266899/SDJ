
import java.util.Scanner;

public class GradeConversion 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int grade;
		
		System.out.println("Enter your grade: ");
		grade = keyboard.nextInt();
	
		switch (grade)
		{
		case 12 : System.out.println("Your grade in ECTS: A"); break;
		case 10 : System.out.println("Your grade in ECTS: B"); break;
		case 7 : System.out.println("Your grade in ECTS: C"); break;
		case 4 : System.out.println("Your grade in ECTS: D"); break;
		case 2 : System.out.println("Your grade in ECTS: E"); break;
		case 0 : System.out.println("Your grade in ECTS: Fx"); break;
		case -3 : System.out.println("Your grade in ECTS: F"); break;
		default : 
		System.out.println("Invalid grade");

		}
	}
}
