 	import java.util.Scanner;
public class Time_Calculator 
{
 public static void main (String[] args)
 {
	 Scanner keyboard = new Scanner(System.in);
	 
	 long seconds;
	 
	 System.out.println("Enter the seconds: ");
	 seconds = keyboard.nextLong();
	 
	 if (seconds >= 60 && seconds < 3600)
	 {
		 System.out.println(seconds / 60 + " minutes and " + seconds % 60 + " seconds");
	 }
	 
	 else if (seconds < 60)
	 {
		 System.out.println(seconds + " seconds");
	 }
	 
	 else if (seconds >= 3600 && seconds < 86400)
	 {
		 System.out.println(seconds / 3600 + " hours " + seconds % 3600 / 60 + " minutes " + seconds % 3600 % 60 + " seconds" );
	 }
	 
	 else if (seconds >= 86400)
	 {
		 System.out.println(seconds / 86400 + " days " + seconds % 86400 / 3600 + " hours " + seconds % 86400 % 3600 / 60 + " minutes " + seconds % 86400 % 3600 % 60 + " seconds" );
	 }
 }
}
