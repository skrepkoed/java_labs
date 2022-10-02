package lr1;

import java.util.Scanner;

public class Month_echo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter month:");
		String month = get_string(input);
		System.out.println("Enter amount days in month:");
		String days_in_month = get_string(input);
		System.out.println("In "+month+days_in_month+"days");
	}
	private static String get_string (Scanner input) {
		return input.nextLine() + " ";  
	}
}
