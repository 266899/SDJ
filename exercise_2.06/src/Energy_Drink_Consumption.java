
public class Energy_Drink_Consumption 
{
	public static void main (String[] args)
	{
		
		int customers = 15000;
		double oneOrMore = 0.18;
		double prefersCitrus = 0.58;
		
		double boughtOneOrMore = customers * oneOrMore;
		double peopleWhoPreferCitrus = boughtOneOrMore * prefersCitrus;
		
		System.out.println("People who purchased one or more energy drinks: " + boughtOneOrMore);
		System.out.println("People who prefers citrus energy drinks: " + peopleWhoPreferCitrus);	
	}
}
