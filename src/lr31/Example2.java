package lr31;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("Enter weekday");
		Scanner input = new Scanner(System.in);
		String weekday= input.next();
		input.close();
		switch ( weekday){
		case "Monday": {
			System.out.println("Monday is 1 day in week");
			break;
		}
		case "Tuesday": {
			System.out.println("Tuesday is 2 day in week");
			break;
		}
		case "Wednesday": {
			System.out.println("Wednesday is 3 day in week");
			break;
		}
		case "Thursday": {
			System.out.println("Thursday is 4 day in week");
			break;
		}
		case "Friday": {
			System.out.println("Friday is 5 day in week");
			break;
		}
		case "Saturday": {
			System.out.println("Friday is 6 day in week");
			break;
		}
		case "Sunday": {
			System.out.println("Friday is 7 day in week");
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}

	}

}
