package t1;
public class t2 {
	public static void main (String[] args) {
		int [] array =  {1,2,3,4};
		
		int first = array[0];
		for (int i = 0; i< array.length; i++)
		{
			System.out.print(array[i] + " ");
			
		}
		System.out.println();
		
		for (int i = array.length-1; i < array.length; i--)
		{
			
			System.out.print(array[i] + " ");
			
		}
		
	}

}
