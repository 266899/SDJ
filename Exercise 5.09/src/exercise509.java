
public class exercise509 
{
	public static void main (String[] args)
	{
		double Pi = 4;
		double topNumber = 4;
		int botNumber = 3; 
		for (int i=0; i < 500; i++)
		{
			Pi -= (topNumber/botNumber);
			botNumber += 2;
			Pi += (topNumber/botNumber);
			botNumber += 2;
		}
		
		System.out.println(Pi);
		
	}

}
