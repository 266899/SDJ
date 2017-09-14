
public class Exercise702
{
	public static void main (String[] args)
	{
	
		String[] array = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"}; 
		
		for (int i=0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		for (int i=0; i < array.length-1; i++)
		{
			array[i]= array[i+1];
		}
		
		for (int i=0; i < array.length-1; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
