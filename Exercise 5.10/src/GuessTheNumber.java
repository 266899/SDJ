import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		System.out.println("Guess the number: ");
		Scanner keyboard = new Scanner(System.in);
		int number = 0;
		int count = 0;
		Random random = new java.util.Random();
		int target = random.nextInt(1024) + 1;

		while (number != target) {
			number =  keyboard.nextInt();
			count++;
			if (number > target) {
				System.out.println("Lower");
			} else if (number < target) {
				System.out.println("Higher");
			} else {
				System.out.println("Right");
				System.out.println("Number of times needed: " + count);
					break;
			}
		
		}

	}
}
