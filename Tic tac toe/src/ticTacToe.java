import java.util.ArrayList;
import java.util.Scanner;
public class ticTacToe 
{
	public static void main (String[] args)
	{
//------------------------------------------------------------------------------------------
//		char[][] board = {{'o', ' ', ' '}, {' ', 'x', ' '}, {' ',' ',' '}};
//
//		for (int i=0; i<2; i++)
//		{
//			System.out.print(board[0][i] + " | ");
//		}
//		System.out.println("\n----------");
//		for (int i=0; i<2; i++)
//		{
//			System.out.print(board[1][i] + " | ");
//		}
//		System.out.println("\n----------");
//		for (int i=0; i<2; i++)
//		{
//			System.out.print(board[2][i] + " | ");
//		}
//------------------------------------------------------------------------------------------
	
		int x = 0;
		int y = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter coordinates(x(0-2) and y(0-2): ");
		x = keyboard.nextInt();
		y = keyboard.nextInt();
		
	
			if (x == 0 && y == 0)
			{
			 char[][] board = {{'x', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
			 for (int i = 0; i<2; i++)
			 	{
				 	System.out.print(board[0][i] + " | " );
			 	}
			 System.out.println("\n----------");
			 for (int i = 0; i<2; i++)
			 	{
				 	System.out.print(board[1][i] + " | " );
			 	}
			 System.out.println("\n----------");
			 for (int i = 0; i<2; i++)
			 	{
				 	System.out.print(board[2][i] + " | " );
			 	}
			}
			
//-------------------------
			
			if (x == 1 && y ==0)
			{
			 char[][] board = {{' ', ' ', ' '}, {'x', ' ', ' '}, {' ', ' ', ' '}};
			 for (int i = 0; i<2; i++)
			 	{
				 	System.out.print(board[0][i] + " | " );
			 	}
			 System.out.println("\n----------");
			 for (int i = 0; i<2; i++)
			 	{
				 	System.out.print(board[1][i] + " | " );
			 	}
			 System.out.println("\n----------");
			 for (int i = 0; i<2; i++)
			 	{
				 	System.out.print(board[2][i] + " | " );
			 	}
			}
//-------------------------
			if (x == 2 && y ==0)
			{
			 char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {'x', ' ', ' '}};
			 for (int i = 0; i<2; i++)
			 	{
				 	System.out.print(board[0][i] + " | " );
			 	}
			 System.out.println("\n----------");
			 for (int i = 0; i<2; i++)
			 	{
				 	System.out.print(board[1][i] + " | " );
			 	}
			 System.out.println("\n----------");
			 for (int i = 0; i<2; i++)
			 	{
				 	System.out.print(board[2][i] + " | " );
			 	}
			}
			
//-------------------------
			
			if (x == 0 && y ==1)
			{
				char[][] board = {{' ','x', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
				for (int i = 0; i<2; i++)
			 	{
				 	System.out.print(board[0][i] + " | " );
			 	}
			 System.out.println("\n----------");
			 for (int i = 0; i<2; i++)
			 	{
				 	System.out.print(board[1][i] + " | " );
			 	}
			 System.out.println("\n----------");
			 for (int i = 0; i<2; i++)
			 	{
				 	System.out.print(board[2][i] + " | " );
			 	}
			}
//-------------------------
			if (x == 0 && y ==2)
			{
			 char[][] board = {{' ',' ', 'x'}, {' ', ' ', ' '}, {' ', ' ', ' '}};
			 for (int i = 0; i<3; i++)
			 	{
				 	System.out.print(board[0][i] + " | " );
			 	}
			 System.out.println("\n----------");
			 for (int i = 0; i<3; i++)
			 	{
				 	System.out.print(board[1][i] + " | " );
			 	}
			 System.out.println("\n----------");
			 for (int i = 0; i<3; i++)
			 	{
				 	System.out.print(board[2][i] + " | " );
			 	}
			}
//-------------------------
			if (x ==1  && y ==1)
			{
			 char[][] board = {{' ',' ', ' '}, {' ', 'x', ' '}, {' ', ' ', ' '}};
			 for (int i = 0; i<2; i++)
			 	{
				 	System.out.print(board[0][i] + " | " );
			 	}
			 System.out.println("\n----------");
			 for (int i = 0; i<2; i++)
			 	{
				 	System.out.print(board[1][i] + " | " );
			 	}
			 System.out.println("\n----------");
			 for (int i = 0; i<2; i++)
			 	{
				 	System.out.print(board[2][i] + " | " );
			 	}
			}
//-------------------------
			if (x ==1  && y ==2)
			{
			 char[][] board = {{' ',' ', ' '}, {' ', ' ', 'x'}, {' ', ' ', ' '}};
			 for (int i = 0; i<3; i++)
			 	{
				 	System.out.print(board[0][i] + " | " );
			 	}
			 System.out.println("\n----------");
			 for (int i = 0; i<3; i++)
			 	{
				 	System.out.print(board[1][i] + " | " );
			 	}
			 System.out.println("\n----------");
			 for (int i = 0; i<3; i++)
			 	{
				 	System.out.print(board[2][i] + " | " );
			 	}
			}
//-------------------------
			if (x == 2 && y ==1)
			{
			 char[][] board = {{' ',' ', ' '}, {' ', ' ', ' '}, {' ', 'x', ' '}};
			 for (int i = 0; i<2; i++)
			 	{
				 	System.out.print(board[0][i] + " | " );
			 	}
			 System.out.println("\n----------");
			 for (int i = 0; i<2; i++)
			 	{
				 	System.out.print(board[1][i] + " | " );
			 	}
			 System.out.println("\n----------");
			 for (int i = 0; i<2; i++)
			 	{
				 	System.out.print(board[2][i] + " | " );
			 	}
			}
//-------------------------
			if (x == 2 && y ==2)
			{
			 char[][] board = {{' ',' ', ' '}, {' ', ' ', ' '}, {' ', ' ', 'x'}};
			 for (int i = 0; i<3; i++)
			 	{
				 	System.out.print(board[0][i] + " | " );
			 	}
			 System.out.println("\n----------");
			 for (int i = 0; i<3; i++)
			 	{
				 	System.out.print(board[1][i] + " | " );
			 	}
			 System.out.println("\n----------");
			 for (int i = 0; i<3; i++)
			 	{
				 	System.out.print(board[2][i] + " | " );
			 	}
			}
			
			
	}
}
