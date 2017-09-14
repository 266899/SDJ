
import java.util.Scanner;
public class exercise507 
{
public static void main (String[] args)
{
 int integer;
 	Scanner keyboard = new Scanner(System.in);
 	
 	System.out.println("Enter an integer: ");
 	integer = keyboard.nextInt();
	
 	for (int i=1; i<=integer; i++)
 	{
 		System.out.println(i);
 	}

 	System.out.println();
 	System.out.println();
 	for (int i=1; i<=integer; i++)
 	{
 		System.out.println( 2 * i);
 	}
 	
 	System.out.println();
 	System.out.println();
 	
	for (int i=1; i<=integer; i++)
 	{
 		System.out.println( i*i );
 	}
}

}
