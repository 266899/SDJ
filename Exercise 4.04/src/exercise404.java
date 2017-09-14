
import java.util.Scanner;

public class exercise404
{
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
				
	int a, c;
	double D, x, b;
		
		System.out.println("Ender 'a': ");
		a = keyboard.nextInt();
		
		System.out.println("Enter 'b': ");
		b = keyboard.nextInt();
		
		System.out.println("Enter 'c': ");
		c = keyboard.nextInt();
		
		D=Math.pow(b, 2) - 4 * a * c;
		
		if (D < 0)
		{
			System.out.println("0 solutions");
		}
		
		else if (D == 0)
		{
			x = -(b / ( 2 * a) );
					System.out.println("x = " + x);
		}
		
		else if (D > 0)
		{
			x = ( ( - b + Math.sqrt(D) ) / 2 * a);
			System.out.print("x = " + x + " 1and x = ");
			x = ( ( - b - Math.sqrt(D) ) / 2 * a);
					System.out.println( x );
		}
	}
}