package lr1;

import java.util.Scanner;

public class Day_echo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter day of week:");
		String weekday= get_string(input);
		System.out.println("Enter month:");
		String month = get_string(input);
		System.out.println("Enter dayin month:");
		String day = get_string(input);
		System.out.println("Today: "+weekday+day+month);
	}
	private static String get_string (Scanner input) {
		return input.nextLine() + " ";  
	}
}
