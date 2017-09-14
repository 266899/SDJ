
public class golf_tournament 
{
	public static void main (String[] args)
	{
		int[] numberOfHits = {3, 5, 1, 3, 3, 2, 4, 1, 3};
		int totalNumberOfHits = 0;
		int numberOfHolesInOne = 0;
		for (int i=0; i<numberOfHits.length; i++)
		{
		totalNumberOfHits += numberOfHits[i];
		
		if (numberOfHits[i] == 1)
		{
			numberOfHolesInOne++;
		}
		}
		double averageHitsPerHole = (double)totalNumberOfHits/numberOfHits.length;
		System.out.println("Total number of hits: " + totalNumberOfHits);
		System.out.printf("average hits per hole: %.2f\n", averageHitsPerHole);
		System.out.println("Number of Hole-in-One's: " + numberOfHolesInOne);
	}
}
