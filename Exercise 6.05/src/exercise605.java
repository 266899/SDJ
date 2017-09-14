 import java.util.Scanner;
 
public class exercise605 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int [][] array2D;
		array2D = new int[4][3];
		int rows = 4;
		int columns = 3;
		int smallest = 0;
		
			for (int i = 0; i < rows; i++)
			{
				for (int j=0; j < columns; j++) 
				{
					array2D[i][j] = keyboard.nextInt();
				}
			}
		
			for (int i = 0; i < rows; i++)
			{
				for (int j=0; j < columns; j++) 
				{
					System.out.print(array2D[i][j] + " ");
				}
			}
			smallest = array2D[0][0];
			
			for (int i = 0; i < array2D.length; i++)
			{
				for (int j= 0; j < array2D[i].length; j++)
				{
						if (smallest > array2D[i][j])
						{
							smallest = array2D[i][j]; 
						}
				}
			}
			System.out.println();
		System.out.println("Smallest: " + smallest);
			
			
	}
}
