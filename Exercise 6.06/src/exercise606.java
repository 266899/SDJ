import java.util.Scanner;

public class exercise606 
{
	static public void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 0; i < 7; i++)
        {
            for (int k = 1; k <= i + 1; k++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
		}
	}
