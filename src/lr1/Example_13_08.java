package lr1;

import java.util.Scanner;

public class Example_13_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your last name:");
		String last_name =get_string(input);
		System.out.println("Enter your first name:");
		String first_name = get_string(input);
		System.out.println("Enter your patronymic:");
		String patronymic = get_string(input);
		System.out.println("Hello "+last_name+first_name+patronymic+"!");
		input.close();
	}
	
	private static String get_string (Scanner input) {
		return input.nextLine() + " ";  
	}
}
