import java.util.ArrayList;
import java.util.Scanner;
public class exercise803 
{
public static void main (String[] args) {
	
	ArrayList<String> list = new ArrayList<>();
	Scanner keyboard = new Scanner(System.in);
	
	String name="A";
	
	while (!(name.equals(""))) {
		name=keyboard.nextLine();
		if(name.equals("")) break;
		else list.add(name);
	
	}
	String[] string = new String[list.size()];
	
	for (int i = 0; i<list.size(); i++) {
		string[i] = list.get(i);
	}
	
	for (int i = 0; i<list.size(); i++) {
		System.out.print(string[i] +  " ");
	}
	}
}
