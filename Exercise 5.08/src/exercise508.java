
public class exercise508 

 {
	public static void main(String[] args) 
	{
		double S = 0;
		double sum = 0;

		for (int i = 0; i < 6; i++) 
		{
			S = S + Math.pow((1.0 / 2), i);
		}
		System.out.println(S);
		S=0;
		
		for (int i = 0; i < 26; i++) 
		{
			S = 	S + Math.pow((1.0 / 2), i);
		}
		System.out.println(S);
		S=0;
		
		for (int i = 0; i < 101; i++) 
		{
			S = S + Math.pow((1.0 / 2), i);
		}
		System.out.println(S);
		
	}

}
